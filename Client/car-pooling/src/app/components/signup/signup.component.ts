import { Component } from '@angular/core';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {
  name:string='';
  email:string='';
  password:string='';
  phoneNo:string='';

  onSubmit(){
    console.log(`Name:${this.name} Email:${this.email} Password:${this.password} PhoneNo:${this.phoneNo}`)
  }
}
