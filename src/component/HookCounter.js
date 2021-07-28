import React,{useEffect, useState} from 'react'

function HookCounter(){
    const initaialCount = 0
   const [count,setCount]= useState(initaialCount)

    return (
        <div>
            <button onClick={()=>setCount(count + 1)}>count{count} </button>
           
        </div>
    )
}
export default HookCounter

