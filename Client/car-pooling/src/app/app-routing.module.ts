import { NgModule,} from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { SignupComponent } from './components/signup/signup.component';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { SearchComponent } from './components/search/search.component';

const routes: Routes = [
  {
    path:"login",component:LoginComponent
  },
  {
    path:"sign-up",component:SignupComponent
  },
  {
    path:"about",component:AboutComponent
  },
  {
    path:'contact',component:ContactComponent
  },
  {
    path:'search',component:SearchComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
