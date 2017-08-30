package todo1

class BootStrap {

  def init = { servletContext ->
     5.times { new Todo(description: "Todo ${it+1}").save() }
  }
  def destroy = {
  }

}
