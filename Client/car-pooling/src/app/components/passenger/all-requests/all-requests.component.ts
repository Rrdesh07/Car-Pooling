import { Component } from '@angular/core';
import { Request } from 'src/app/model/request';

@Component({
  selector: 'app-all-requests',
  templateUrl: './all-requests.component.html',
  styleUrls: ['./all-requests.component.css']
})
export class AllRequestsComponent {
  requests:Request[]=[];
}
