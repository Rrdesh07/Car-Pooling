import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { SearchComponent } from './components/search/search.component';
import { AllRequestsComponent } from './components/passenger/all-requests/all-requests.component';
import { PasengerRequestsComponent } from './components/passenger/pasenger-requests/pasenger-requests.component';
import { PassengerRequestFormComponent } from './components/passenger/passenger-request-form/passenger-request-form.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    SignupComponent,
    AboutComponent,
    ContactComponent,
    SearchComponent,
    AllRequestsComponent,
    PasengerRequestsComponent,
    PassengerRequestFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
