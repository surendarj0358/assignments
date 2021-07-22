import { RobotEyes, RobotHands, Dependencies } from '../greencommute/greenrobot'
import greencommute from '../../integration/greencommute/page_objects/greencommute.json'

context('Green Commute', () => {
    const robotEyes = new RobotEyes();
    const robotHands = new RobotHands();
    const dependencies = new Dependencies();
  

    describe('Job search in Green commute', ()=>{

        beforeEach( () => {
            dependencies.visitGreenCommute()
        })

        it("Mention current location", () => {
            robotEyes.locationVisible()
            robotHands.giveLocation()
        })

        it("Mention job location", () => {
            robotEyes.jobLocationVisible()
            robotHands.giveJobLocation()
        })

        it("Mention jobskill", () => {
            robotEyes.skillVisible()
            robotHands.giveSkill()
        })

        it("navigate to Find Job page",() =>{
            robotHands.giveLocationAndSkill()
            robotEyes.findJobVisible()
            robotHands.findJob()
            robotEyes.zemosoVisible()
            robotHands.clickZemoso()
        })
        it("navigate to Saved Jobs",() => {
            robotHands.giveLocationAndSkill()
            robotEyes.findJobVisible()
            robotHands.findJob()
            robotEyes.zemosoVisible()
            robotHands.clickZemoso()
            robotEyes.savedJobsVisible()
            robotHands.clickSavedJobs()
        
        })

    })

})