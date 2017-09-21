package todo1

class BootStrap {

  def springSecurityService
  def init = { servletContext ->
     5.times { new Todo(description: "Todo ${it+1}").save() }
     def role1 = new Role(authority:"ROLE_USER").save flush:true
     def user1 = new User(username:"user1",password:springSecurityService.encodePassword('pwd1')).save flush:true

     UserRole.create user1, role1, true
     
     

      assert User.count() == 1
      assert Role.count() == 1
      assert UserRole.count() == 1



  }
  def destroy = {
  }

}
