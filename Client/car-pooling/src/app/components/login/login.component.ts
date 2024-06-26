import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  email:string='';
  password:string ='';
  option:string='passenger';

  onSubmit(){
    console.log(`email:${this.email} Password:${this.password} Option:${this.option}`);
  }
}
