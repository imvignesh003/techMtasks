import { BlogPost } from "./components/BlogPost"
import { FavoriteFruits } from "./components/FavouriteFruits"
import { Footer } from "./components/Footer"

function App() {

  return (
    <>
      <div style={{display: "flex", flexDirection: "row", justifyContent: "space-between", alignItems: "center", width: "100%", height: "100vh"}}>
        <FavoriteFruits/>
        <BlogPost/>
      </div>
      <div style={{display: "flex", flexDirection: "row", justifyContent: "center", alignItems: "center", width: "100%", height: "2vh", background:"#f0f0f0", fontSize: 24}}>
        <Footer/>
      </div>
    </>
  )
}

export default App
