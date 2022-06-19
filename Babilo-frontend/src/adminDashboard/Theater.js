import React, { useState,useEffect } from "react";

import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import AdminHeader from "../Header/adminHeader";
import './addmovie.css';
import axios from 'axios';
import {useNavigate} from 'react-router-dom';
import Button from '@mui/material/Button';

import { EditRoadTwoTone } from "@mui/icons-material";
function Theater(props) {
const navigate = useNavigate();

    const [theaters, setTheaters] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:9090/theater/theatersInfo').then((response) => {
            console.log(response.data);
            setTheaters(response.data)

        }).catch((error) => {

        });
    },[]);

    const editTheater = (theater) => {
        let data = {
            ...theater,
            edit: true
        }
        navigate('/addTheater', { state: data });
    }

    
    const addtheater = () => {
        let data = {
            edit: false
        }
        navigate('/addTheater', { state: data });
    }
    return(
        <div>
             <AdminHeader />
             <div className="tablemodel">
             <Button variant="contained" className="float" onClick={()=> addtheater()}>Add Theater</Button>
            <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
          <TableCell>Theater Id</TableCell>
            <TableCell>Theater Name</TableCell>
            <TableCell align="left">Theater Location</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {theaters.map((theater) => (
            <TableRow
              key={theater.theaterId}
              sx={{ '&:last-child td, &:last-child th': { border: 0 }

             }}
             onClick={() => editTheater(theater)}
            >
              <TableCell component="th" scope="movie">
                {theater.theaterId}
              </TableCell>
              <TableCell align="left">{theater.theaterName}</TableCell>

              <TableCell align="left">{theater.theaterLocation}</TableCell>
             
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
    </div>
        </div>

    )

}

export default Theater;