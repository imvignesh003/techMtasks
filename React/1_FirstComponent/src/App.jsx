import Gallery from "./components/Gallery"
import Profile from "./components/Profile"


function App() {

  return (
    <>
      <div style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center'}}>
        <Gallery/>
        <Profile/>
      </div>
    </>
  )
}

export default App
