import { AmazonEyes, AmazonHands, Dependency } from '../amazon/amazonrobot'



context('Amazon',()=>{
    const dependency = new Dependency();
    const amazonhands = new AmazonHands();
    const amazoneyes = new AmazonEyes();

describe('Amazon Assignment', () => {

    beforeEach(() => {
        dependency.visitAmazonIndia()
    })
    
    it('Check Todays Deal', () => {

       amazonhands.visitTodayDeal()
       amazonhands.getThirdProduct()

    })
    it('Handling Tabs',() => {
        amazonhands.signInAmazon()
        amazonhands.handlingTabs()
    })
    it.only('Search Mobiles', () => {

        amazonhands.searchMobile()
        amazoneyes.verifyBeforeNavigationLink()
        amazonhands.navigationToLeft()
        amazoneyes.verifyNavigation1()
        amazonhands.navigationToLeft()
        amazoneyes.verifyNavigation2()

    
        })
    it ('Click My Oder',() => {
        amazonhands.signInAmazon()
        amazonhands.navigateToYourOrder()
    })

    it('Add Payment Detail',() =>{
        amazonhands.signInAmazon()
        amazonhands.addPaymentDetails()
        amazoneyes.verrifyPaymentDetail()

    })


    it('Add Delivery Address',() => {
        amazonhands.signInAmazon()
        amazonhands.addNewDeliveryAddress()
        amazoneyes.verrifyNewDeliveryAddress()
       
    })
})
})