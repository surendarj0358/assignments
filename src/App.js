
import './App.css';
import { Component } from 'react';
import LifecycleA from './cycle/LifecycleA';
import { Functionalcomponents } from './Functionalcomp'
import Classcomponent from './Classcomponent';
import Classcounter from './component/classcounter';
import Useeffect from './component/Useeffect';
import HookCounter from './component/HookCounter';
import Student from './props';


class App extends Component {
    render() {

        return (<div className="App" >
            <LifecycleA/>
           {/* <Functionalcomponents/> 
            <Classcomponent/> 
            <Classcounter/>
             <Useeffect/> */}
             
             {/* <HookCounter/>  */}
          
            
             {console.log("Hi")}
             <button onClick={()=>console.log('surendar')}> click</button> 
            </div>
            )
    }
} 
export default App