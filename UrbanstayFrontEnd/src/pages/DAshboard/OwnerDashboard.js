import React, { useState } from 'react'
import { Link } from 'react-router-dom'
import { FaThList, FaAddressBook, FaBed, FaChartPie } from "react-icons/fa";
import './dashboard.css'
export default function Dashboard() {
   const id=1;
    // useState{id, setId}={};
    return (
        <>


            <div class="container-fluid display-table">
                <div class="row display-table-row">
                    <div class="col-md-2 col-sm-1 hidden-xs display-table-cell v-align box" id="navigation">
                        <div class="logo">

                        </div>
                        <div class="navi">
                            <ul>
                            <li class="active">
                                    <Link to={"/admin"}>
                                        <span class="hidden-xs hidden-sm">
                                            <FaChartPie className="icons mx-2" style={{color:"white"}} size={20}/>
                                            Dashboard
                                        </span>
                                    </Link>
                                </li>
                                <li class="">
                                    <Link to={`/owner/${id}/tenants`}>
                                        <span class="hidden-xs hidden-sm">
                                            <FaThList className="icons mx-2" style={{color:"white"}} size={20}/>                                    
                                            Tenants
                                        </span>
                                    </Link>
                                </li>
                                <li class="">
                                    <Link to={`/owner/${id}/rooms`}>
                                        <span class="hidden-xs hidden-sm">
                                            <FaAddressBook className="icons mx-2" style={{color:"white"}} size={20}/>                                    
                                            Rooms
                                        </span>
                                    </Link>
                                </li>
                                <li class="">
                                    <Link to={`/owner/${id}/bookings`}>
                                        <span class="hidden-xs hidden-sm">
                                            <FaBed className="icons mx-2" style={{color:"white"}} size={20}/>                                    
                                            Bookings
                                        </span>
                                    </Link>
                                </li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-md-10 col-sm-11 display-table-cell v-align">
                        <div class="row">
                        </div>
                    </div>
                </div>

            </div>



            <div id="add" class="modal fade" role="dialog">
                <div class="modal-dialog">


                    <div class="modal-content">
                        <div class="modal-header login-header">
                            <button type="button" class="close" data-dismiss="modal">×</button>
                            <h4 class="modal-title">Add User</h4>
                        </div>
                        <div class="modal-body">
                            <input type="text" placeholder="Enter Name" name="name" />
                            <input type="text" placeholder="Enter Email" name="mail" />
                            <input type="text" placeholder="Enter Password" name="passsword" />
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="cancel" data-dismiss="modal">Close</button>
                            <button type="button" class="add-" data-dismiss="modal">Save</button>
                        </div>
                    </div>

                </div>
            </div>























        </>
    )
}
