import { Component } from '@angular/core';

@Component({
  selector: 'app-passenger-request-form',
  templateUrl: './passenger-request-form.component.html',
  styleUrls: ['./passenger-request-form.component.css']
})
export class PassengerRequestFormComponent {
  passengerName:string='';
  passengerPhoneNo:string='';
  source:string='';
  destination:string='';
  date:string='';
  time:string='';
  carName:string='';
  noPlate:string='';
  carType:string='';
  carUserName:string='';
  carUserPhoneNo:string='';
  passengerNoOfSeats:string='';
  perUserCost:string='';
  
  handlePassengerRequest(){

  }
}
