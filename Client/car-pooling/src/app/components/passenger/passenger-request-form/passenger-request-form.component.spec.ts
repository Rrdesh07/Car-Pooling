import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PassengerRequestFormComponent } from './passenger-request-form.component';

describe('PassengerRequestFormComponent', () => {
  let component: PassengerRequestFormComponent;
  let fixture: ComponentFixture<PassengerRequestFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PassengerRequestFormComponent]
    });
    fixture = TestBed.createComponent(PassengerRequestFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
