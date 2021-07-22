import { BaseHands, BaseEyes, BaseDependencies } from '../../robots/BaseRobot'
import greencommute from '../../integration/greencommute/page_objects/greencommute.json'
import datas from '../../integration/greencommute/Data/datas.json'

export class Dependencies extends BaseDependencies {
    visitGreenCommute(){
        this.accessUrl('http://bc15-green-commute.dev-apps.io/')
    }
}


export class RobotEyes extends BaseEyes{

    locationVisible(){
        this.seesDomVisible(greencommute.location.giveCurrentLocation)
       
    }
    jobLocationVisible(){
        this.seesDomVisible(greencommute.joblocation.giveJobLocation)
    }
    skillVisible(){
        this.seesDomVisible(greencommute.jobSkill.giveJobSkill)
    }
    findJobVisible(){
        this.seesDomVisible(greencommute.findJob.clickSearch)
    }
    savedJobsVisible(){
      
        this.seesDomVisible(greencommute.savedJobs.clickRemove)
        
    }  
    zemosoVisible(){
      
        this.seesDomVisible(greencommute.click.zomeso)
        
    }  
    
  
}

export class RobotHands extends BaseHands{

    giveLocation(){

        cy.get(greencommute.location.giveCurrentLocation).type(datas.loc3.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.location.giveCurrentLocation).type(datas.loc2.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.location.giveCurrentLocation).type(datas.loc1.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.location.giveCurrentLocation).type(datas.location.location)
        this.clickOnDomElement(greencommute.location.clickNext)
    }

    giveJobLocation(){
        cy.get(greencommute.location.giveCurrentLocation).type(datas.location.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc3.joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc2 .joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc1 .joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc.joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)
    
    }

    giveSkill(){
        cy.get(greencommute.location.giveCurrentLocation).type(datas.location.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc.joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)

        cy.get(greencommute.jobSkill.giveJobSkill).click().type(datas.jobSkill3 .jobskill)
        this.clickOnDomElement(greencommute.jobSkill.clickNext)

       
    }

    giveLocationAndSkill(){

        cy.get(greencommute.location.giveCurrentLocation).type(datas.location.location)
        this.clickOnDomElement(greencommute.location.clickNext)

        cy.get(greencommute.joblocation.giveJobLocation).click().type(datas.jobLoc.joblocation)
        this.clickOnDomElement(greencommute.joblocation.clickNext)

        cy.get(greencommute.jobSkill.giveJobSkill).click().type(datas.jobSkill.jobskill)
        this.clickOnDomElement(greencommute.jobSkill.clickNext)

    }


    findJob(){
      
        this.clickOnDomElement(greencommute.findJob.clickSearch)
    }

    clickZemoso(){
        this.clickOnDomElement(greencommute.click.zomeso)
        this.clickOnDomElement(greencommute.click.clickSave)
    }
    clickSavedJobs(){
      
        this.clickOnDomElement(greencommute.savedJobs.clickedSaveJobs)
        this.clickOnDomElement(greencommute.savedJobs.clickSavedZemoso)
        this.clickOnDomElement(greencommute.savedJobs.clickRemove)
    }
}




