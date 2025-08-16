import { Component } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.scss'
})
export class DashboardComponent {
  riskItems = [
    { supplier: 'Supplier A', risk: 'High', type: 'Delay' },
    { supplier: 'Supplier B', risk: 'Medium', type: 'Compliance' },
    { supplier: 'Supplier C', risk: 'Low', type: 'Disruption' },
  ];  
}
