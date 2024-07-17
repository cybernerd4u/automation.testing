describe('Zero Bank Login Testing', ()=> {

  it('Should login successfully with valid credentials', ()=> {
      
      cy.visit('http://zero.webappsecurity.com/login.html')
      cy.get("[name='user_login']").type("username")
      cy.wait(2000)
      cy.get("[name='user_password']").type("password")
      cy.wait(2000)
      cy.get("[name='submit']").click()
      cy.wait(2000)
      cy.url()
      .should('include', 'http://zero.webappsecurity.com/bank/account-summary.html')
      .log('Login to the application successful')
  });

  it('Should fail login with invalid credentials', ()=> {
      
      cy.visit('http://zero.webappsecurity.com/login.html')
      cy.get("[name='user_login']").type("username123")
      cy.wait(2000)
      cy.get("[name='user_password']").type("password123")
      cy.wait(2000)
      cy.get("[name='submit']").click()
      cy.wait(2000)
      cy.get('.alert.alert-error')
      .should('be.visible')
      .and('contain', 'Login and/or password are wrong')
  
  });
});
  
