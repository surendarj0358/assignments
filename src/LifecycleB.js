import React, { Component } from 'react'

class LifecycleB extends Component {
    
    constructor() {
        super()
        this.state = {
            name: 'Surendar'
        }
        console.log('LifecycleB constructor')
    }

    static getDerivedStateFromProps(props, state) {
        console.log('LifecycleB getDerivedStateFromProps')
        return null
    }

    componentDidMount() {
        console.log('LifecycleB component DidMount')
    }
    componentDidUpdate() {
        console.log('LifecycleB componentDidUpdate ')
    }
    componentWillUnmount() {
            console.log('LifecycleB componentWillUnmount')
    }
      
    render() {
        console.log('LifecycleB Render');

        return ( <div>Lifecycle B </div>)

        }
    }

    export default LifecycleB