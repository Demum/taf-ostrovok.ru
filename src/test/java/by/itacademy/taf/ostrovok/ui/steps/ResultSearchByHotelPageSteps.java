package by.itacademy.taf.ostrovok.ui.steps;

import by.itacademy.taf.ostrovok.ui.pageobjects.MainPage;
import by.itacademy.taf.ostrovok.ui.pageobjects.ResultSearchByHotelPage;

public class ResultSearchByHotelPageSteps {
    public void searchByHotel(){
        MainPage mainPage = new MainPage();
        ResultSearchByHotelPage resultSearchByHotelPage = new ResultSearchByHotelPage();
        mainPage.setInputDestinationSting(resultSearchByHotelPage.getInputHotelName());
        mainPage
                .typeDestination(mainPage.getInputDestinationSting())
                .clickSugestDestination()
                .clickButtonCheckInDatePicker()
                .clickDatePickerCheckIn()
                .clickDatePickerCheckOut()
                .clickButtonGuestInput()
                .clickButtonAdultPlus()
                .clickButtonAddChild()
                .clickButtonAddChildTwoYearsOld()
                .clickButtonDoneWithChild()
                .clickButtonSearch();
    }
}
