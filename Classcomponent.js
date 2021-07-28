import React, { Component, component } from 'react'

export default class Classcomponent extends Component {
    componentDidMount(){
        console.log('i was triggeered')
    }
    render() {
        console.log('i was triggeered')
        return (<h1 > Class Component </h1>
        )
    }
}
 