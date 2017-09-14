package todo1

class BootStrap {

  def init = { servletContext ->
     5.times { new Todo(description: "Todo ${it+1}").save(flush: true) }
     Role admin = new Role("ROLE_ADMIN").save(flush: true)
     User user = new User("user", "pass").save(flush: true)
     
     UserRole.create(user, admin, true)
	println user.properties
  }
  def destroy = {
  }

}
