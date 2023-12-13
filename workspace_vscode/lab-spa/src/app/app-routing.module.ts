import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookTableComponent } from './components/book-table/book-table.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [

  {
    path: 'booktable',
    component: BookTableComponent
  },

  {
    path: '',
    component: HomeComponent

  },

  {
    path: '**',
    component:NotFoundComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
