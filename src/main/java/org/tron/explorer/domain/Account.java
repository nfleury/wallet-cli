/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.tron.explorer.domain;


public class Account {

  private String name;
  private String address;
  private String balance;

  public Account(String address, String balance) {
    this.address = address;
    this.balance = balance;
  }

  public Account(String name, String address, String balance) {
    this.name = name;
    this.address = address;
    this.balance = balance;
  }

  public Account() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getBalance() {
    return this.balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "Account{" +
        "name='" + name + '\'' +
        "address='" + address + '\'' +
        ", balance='" + balance + '\'' +
        '}';
  }
}
