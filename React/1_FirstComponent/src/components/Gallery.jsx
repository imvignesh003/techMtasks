import React from 'react'
import Greeting from './Greeting'

const Gallery = () => {
  return (
    <div>
        <Greeting />
        <img src="https://cdn.pixabay.com/photo/2025/03/19/19/04/man-9481358_960_720.jpg" alt="Sample" height={200} width={200} />
    </div>
  )
}

export default Gallery