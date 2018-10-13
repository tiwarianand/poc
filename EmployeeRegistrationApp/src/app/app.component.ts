import { Component, OnInit, ViewChild, AfterViewInit } from '@angular/core';
import { EmployeeService } from './employee.service';
import {MatTableDataSource, MatPaginator, MatSort} from '@angular/material';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit,AfterViewInit{
  title = 'EmployeeRegistrationApp';
  constructor(private employeeReg:EmployeeService){}  
  emp: any ;
  genders = [{'name': 'MALE'}, {'name': 'FEMALE'}];
  selectedGender = 'MALE';
  
  ngOnInit(){
    
    this.getEmployees();
  }

  getEmployees(){
    console.log("Get employees");
    this.employeeReg.getAllEmployees().subscribe( 
      data => {this.emp = data;
        console.log(data);
      }
    );
  }
  onClickSubmit(data){
    console.log(data);
    this.employeeReg.saveEmployee(data).subscribe(
      (resp)=>{
        console.log(resp);
        console.log("Completed");
        this.getEmployees();
      }
    );
  }
  displayedColumns = ['firstName', 'lastName', 'gender','dob','department?.departmentName'];
  dataSource = new MatTableDataSource(this.emp);
  @ViewChild(MatSort) sort: MatSort;
  @ViewChild(MatPaginator) paginator: MatPaginator;
ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }
}

