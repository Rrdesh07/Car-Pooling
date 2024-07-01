import { Car } from "./car";
import { User } from "./user";

export class Request {
    source:string='';
    destination:string='';
    seatsBooked:string='';
    totalCost:number=0;
    userCost:number=0;
    time:string='';
    date:string='';
    reqType:string='';
    user:User={name:'',email:'',password:'',phoneNo:''};
    car:Car={name:'',totalNoOfSeats:'',noOfBookedSeats:'',noPlate:'',type:''}
}
