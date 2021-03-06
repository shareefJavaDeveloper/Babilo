import React, {useEffect,useState} from "react";
  
// importing material UI components
import AppBar from "@mui/material/AppBar";
import Box from "@mui/material/Box";
import Toolbar from "@mui/material/Toolbar";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";
import IconButton from "@mui/material/IconButton";
import MenuIcon from "@mui/icons-material/Menu";
import {useNavigate, useLocation} from 'react-router-dom';
import './header.css'
  
export default function AdminHeader() {
    const navigate = useNavigate();
    const [url, setUrl] = useState(null);
    const location = useLocation();
  useEffect(() => {
    setUrl(location.pathname);
    console.log(location.pathname)
  }, [location]);


  return (
      <AppBar position="static">
        <Toolbar>
          {/*Inside the IconButton, we 
           can render various icons*/}
          <IconButton
            size="large"
            edge="start"
            color="inherit"
            aria-label="menu"
            sx={{ mr: 2 }}
          >
            {/*This is a simple Menu 
             Icon wrapped in Icon */}
            <MenuIcon />
          </IconButton>
          <Typography variant="h6" 
            component="div" sx={{ flexGrow: 1 }}>
            Babilo Movie Booking
          </Typography>
          {/* The Typography component applies 
           default font weights and sizes */}
            <Button color="inherit" onClick={() => navigate('/Movies')} className={url === '/Movies'? "active" : url === '/addMovie'? "active" : ''}>Movies</Button>
            <Button color="inherit" onClick={() => navigate('/Theaters')} className = {url === '/Theaters'? "active" :url === '/addTheater' ? "active": ""}>Theaters</Button>
            <Button color="inherit" onClick={() => navigate('/Schedules')} className= { url === '/Schedules' ? "active" : url === '/addSchedule'? "active" : ""}>Movie Schedules</Button>
          
          <Typography variant="h6" className="headerTitle" 
            component="div" sx={{ flexGrow: 1 }}>
           Admin 
                     </Typography>
          {/* <Button color="inherit">Login</Button> */}
        </Toolbar>
      </AppBar>
  );
}