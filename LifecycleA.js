import React, { Component } from 'react'
import LifecycleB from './LifecycleB'
import Student from '../props'

class LifecycleA extends Component {
    constructor(props) {
        super(props)
        this.state = {
            name: 'React'
        }
        console.log('LifecycleA constructor')
    }

    static getDerivedStateFromProps(props, state) {
        console.log('LifecycleA getDerivedStateFromProps')
        document.write('State 1')
        return null
    }

    componentDidMount() {
        console.log('LifecycleA component DidMount')
    }
    componentDidUpdate() {
        console.log('LifecycleB componentDidUpdate ')
    }
    componentWillUnmount() {
            console.log('LifecycleB componentWillUnmount')
        }
       
    changeState = () => {
        this.setState({
            name: 'Surendar'
        })
    }
    render() {
        console.log('LifecycleA Render');

        return ( <div>
            <div>LifecycleA</div>
            
  <button onClick = { this.changeState }> Change </button>
            
           <LifecycleB/> 
          
          
            </div>
        )
    }
}

export default LifecycleA