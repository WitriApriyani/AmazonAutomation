Feature: Order Amazon

  Scenario: Order Item
    When navigate to url
    And click sidebar
    And click electronic
    And click televisionvideo
    And click television
    And click inchies
    And click filter
    And click price
    And click go
    And click year
    And click product
    Then print product detail
    And click add to list
    Then validate sign in page
    And input email
    And click continue
    Then validate site 
   