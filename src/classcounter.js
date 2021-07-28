import React,{Component, component}from 'react'

class Classcounter extends Component{
    constructor(props){
        super(props)

        this.state = {
            count:0
        }
    }
    incrementCount = () => {
        this.setState({
            count:this.state.count +1
        })
        
    }
    render(){
        return(
            <div>
<button onClick={this.incrementCount}> count{this.state.count}</button>
            </div>
        )
    }
}
export default Classcounter