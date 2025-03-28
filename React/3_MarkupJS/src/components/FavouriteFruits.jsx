import { WebsiteLink } from "./WebsiteLink";

export function FavoriteFruits() {
    return (

        <div style={{display: "flex",flex:1, flexDirection: "column",justifyContent:"center", alignItems: "center", width: "33%", height: "100vh", backgroundColor: "#f0f0f0", fontSize:24}}>     
            <ul style={{listStyleType: "none", padding: 0, margin: 0, display: "flex", flexDirection: "column", alignItems: "center"}}>
                <li>Apple<br></br> 
                    <img src="https://cdn.pixabay.com/photo/2014/02/01/17/30/apple-256268_1280.jpg" width={300} height={200} alt="Apple" /><br></br> 
                    <WebsiteLink/>
                </li>
                <li>Banana<br></br> 
                    <img src="https://cdn.pixabay.com/photo/2023/03/03/19/38/banana-7828351_1280.jpg" width={300} height={200} alt="Banana" /><br></br> 
                    <WebsiteLink/>
                </li>
                <li>Cherry<br></br> 
                    <img src="https://cdn.pixabay.com/photo/2018/06/15/23/27/cherries-3477927_1280.jpg" width={300} height={200} alt="Cherry" /><br></br> 
                    <WebsiteLink/>
                </li>
            </ul>
        </div>   
    );
}