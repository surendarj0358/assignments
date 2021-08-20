Given('navigate to login page', () => {

    cy.visit('https://phptravels.org/index.php?rp=/login')

})


Then('verify the login page was loaded or not', () => {
    cy.title().should('contain', 'PHPTRAVELS')

})

And('click register', () => {
    cy.visit('https://phptravels.org/register.php')

})

Then('verify the register page was loaded or not', () => {

    cy.title().should('contain', 'Register')
})

Then('fill the registration Form', (datatable) => {
    cy.viewport(1280, 1400)
    datatable.hashes().forEach(element => {
        cy.get('#inputFirstName').clear()
        cy.get('#inputFirstName').type(element.firstName)
        cy.get('#inputLastName').clear()
        cy.get('#inputLastName').type(element.secondName)
        cy.get('#inputEmail').clear()
        cy.get('#inputEmail').type(element.email)

        cy.get('.selected-flag').click()
        cy.get('.country-list').children('[data-dial-code="91"]').click()
        cy.get('#inputPhone').clear()
        cy.get('#inputPhone').type(element.mobileNo)
        cy.get('#inputCompanyName').clear()
        cy.get('#inputCompanyName').type(element.address)
        cy.get('#inputAddress1').clear()
        cy.get('#inputAddress1').type(element.addressline2)
        cy.get('#inputCity').clear()
        cy.get('#inputCity').type(element.city)
        cy.get('#inputCountry').select(element.country).should('contains.value', 'IN')
        cy.get('#stateselect').select(element.state)
        cy.get('#inputPostcode').clear()
        cy.get('#inputPostcode').type(element.postalCode)

    })












})