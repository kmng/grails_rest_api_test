package todo1


import grails.rest.*
import grails.converters.*
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_ADMIN'])
class TodoController extends RestfulController {
    static responseFormats = ['json', 'xml']
    TodoController() {
        super(Todo)


    }

    def pending() {
    respond Todo.findAllByDone(false), view: 'index'
  }
}
