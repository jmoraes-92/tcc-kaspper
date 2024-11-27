import { ComponentFixture, TestBed } from '@angular/core/testing';
import { MatTableModule } from '@angular/material/table';

import { ListaComponent } from './lista.component';

describe('ListaComponent', () => {
  let component: ListaComponent;
  let fixture: ComponentFixture<ListaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListaComponent],
      imports: [MatTableModule], // Import necessário para mat-table
    }).compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
