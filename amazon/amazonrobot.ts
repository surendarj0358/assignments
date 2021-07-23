import { BaseHands, BaseEyes, BaseDependencies } from '../../robots/BaseRobot'
import amazon from '../../integration/amazon/pageobjects/amazon.json'



export class Dependency extends BaseDependencies{
    visitAmazonIndia(){
        this.accessUrl('https://www.amazon.in/')
    }
}

export class AmazonEyes extends BaseEyes{
    verifyExpectedQuantity(){
        this.seesDomVisibleWithCustomMatcher('#quantity',"2")

    }
    verifyBeforeNavigationLink(){
        this.seesPathNameInUrl('/New-Apple-iPhone-Mini-256GB/dp/B08L5VCNT5/ref=sr_1_12_sspa')

    }

    verifyNavigation1(){
        this.seesPathNameInUrl('/s')
    }

    verifyNavigation2(){
        this.seesPathNameInUrl('/')
    }
    verrifyPaymentDetail(){
        this.seesDomContainText('.a-expander-header','ending in 9143')
    }

    verrifyNewDeliveryAddress(){
        this.seesDomContainText('#ya-myab-display-address-block-1 > .a-box-inner > .a-section','123A')
    }

}


export class AmazonHands extends BaseHands{


    visitTodayDeal(){
        cy.get(amazon.todayDeal.thirdDeal).trigger(amazon.todayDeal.scrollDownThePage)
        this.clickOnDomElement(amazon.todayDeal.thirdDeal)
    }
   

    getThirdProduct(){
        this.clickOnDomElement(amazon.clickThirdProduct.thirdProduct)
        cy.get(amazon.clickThirdProduct.quantity).select('2').should('have.value', '2')

    }
    handlingTabs(){
        this.clickOnChildDom('nav-xshop','[href="/Kindle-Store/b/?ie=UTF8&node=1571277031&ref_=nav_cs_kindle_books_fbe4f5e5a26f403a91203de3fe5ab05d"]',0)
    
}

    searchMobile(){
        this.typeTextonId('twotabsearchtextbox','Mobiles')
        this.clickOnId('nav-search-submit-button')
        cy.get('[data-asin="B08L5VCNT5"] > :nth-child(1) > .celwidget > [data-component-type="s-impression-logger"] > div.rush-component > .s-expand-height > .a-spacing-medium > :nth-child(2) > :nth-child(1) > .sg-col-inner > .a-spacing-none > .rush-component > .a-link-normal > .a-section > .s-image').trigger('mousedown')    
        cy.visit('https://www.amazon.in/gp/slredirect/picassoRedirect.html/ref=pa_sp_mtf_aps_sr_pg1_1?ie=UTF8&adId=A03722163VHTZ69ZMMBTZ&url=%2FNew-Apple-iPhone-Mini-256GB%2Fdp%2FB08L5VCNT5%2Fref%3Dsr_1_12_sspa%3Fdchild%3D1%26keywords%3Dmobiles%26qid%3D1626954226%26sr%3D8-12-spons%26psc%3D1&qualifier=1626954226&id=2666584508996654&widgetName=sp_mtf')

    }


    navigationToLeft(){
        cy.go('back')
    }


    signInAmazon(){
        this.clickOnId('nav-link-accountList-nav-line-1')
        this.typeTextonId('ap_email','7200747375')
        this.clickOnId('continue')
        this.typeTextonId('ap_password','1234As1234')
        this.clickOnId('signInSubmit')
    }


    navigateToYourOrder(){
        this.clickOnId('nav-orders')
        cy.get('#a-autoid-1-announce').click()  
        cy.get('#orderFilter_3').click();

    }
    addPaymentDetails(){
        this.clickOnId('nav-link-accountList-nav-line-1')
        this.clickOnDomElement(':nth-child(3) > :nth-child(2) > .ya-card__whole-card-link > .a-box > .a-box-inner')
        this.clickOnDomElement('.a-expander-header')
    }

    addNewDeliveryAddress(){
        this.clickOnId('nav-link-accountList-nav-line-1')
        this.clickOnDomElement(':nth-child(3) > :nth-child(1) > .ya-card__whole-card-link > .a-box > .a-box-inner')
        this.clickOnId('ya-myab-address-add-link')
        this.clickOnId('address-ui-widgets-countryCode > .a-button-inner > .a-button-text')
        this.clickOnId('address-ui-widgets-countryCode-dropdown-nativeId_101')
        this.typeTextonId('address-ui-widgets-enterAddressFullName','Surendar')
        this.typeTextonId('address-ui-widgets-enterAddressPhoneNumber','7200747375')
        this.typeTextonId('address-ui-widgets-enterAddressPostalCode','631052')
        this.typeTextonId('address-ui-widgets-enterAddressLine1','123A')
        this.typeTextonId('address-ui-widgets-enterAddressLine2','Subramaniyar koil street,Panapakkam')
        this.typeTextonId('address-ui-widgets-enterAddressCity','Ranipettai')
        this.clickOnId('address-ui-widgets-enterAddressStateOrRegion')
        this.clickOnId('address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_30')
        this.clickOnId('address-ui-widgets-addr-details-address-type-and-business-hours')
        this.clickOnId('dropdown1_1')
        this.clickOnId('address-ui-widgets-form-submit-button > .a-button-inner > .a-button-input')
    
    }


}