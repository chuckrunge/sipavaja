# sipavaja
A simple parameter validator for Java
// lightweight validation for method parameters
//Copyright (C) 2016  Chuck Runge
//Lombard, IL.
//CGRunge001@GMail.com

//This program is free software; you can redistribute it and/or
//modify it under the terms of the GNU General Public License
//as published by the Free Software Foundation; either version 2
//of the License, or (at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.

//You should have received a copy of the GNU General Public License
//along with this program; if not, write to the Free Software
//Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.


We need to validate input parameters to avoid bad suprises in the data.  They will tell you not to worry about the data, but the stacktrace is pointing at your code.  So you own it.

SIPAVAJA

Sipavaja is a simple lightwieght class (validationError) with a simple method (validate) to determine if parameters are null or empty.  This is often all you need!

Create a new validationError object, and pass your parameter to the validate method.

ve = new validationError();
ve.validate(parm);

There are no getters and setters, so one validation object can be shared by multiple methods.

Up to nine parameters are supported.
ve.validate(parm1, parm2, ...);