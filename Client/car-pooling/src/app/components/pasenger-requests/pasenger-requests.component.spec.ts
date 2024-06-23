import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PasengerRequestsComponent } from './pasenger-requests.component';

describe('PasengerRequestsComponent', () => {
  let component: PasengerRequestsComponent;
  let fixture: ComponentFixture<PasengerRequestsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PasengerRequestsComponent]
    });
    fixture = TestBed.createComponent(PasengerRequestsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
