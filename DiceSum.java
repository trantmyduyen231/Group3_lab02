/*
JDice: Java Dice Rolling Program
Copyright (C) 2006 Andrew D. Hilton  (adhilton@cis.upenn.edu)


This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 2
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

 */

public class DiceSum extends DieRoll {
    private final DieRoll r1; // add final, thieu dau";"
    private final DieRoll r2; //add final
    public DiceSum(DieRoll r1,  //thieu dau"," sau r1
		   DieRoll r2) {
	super(0,0,0);
	this.r1=r1;
	this.r2=r2;
    }
    public RollResult makeRoll() { // xoa //
	return r1.makeRoll().andThen(r2.makeRoll()); //them dau "." o sau r1, sau r2
    }
    public String toString() {
	return r1.toString() + " & "+r2.toString(); // them dau "."
    }

}
