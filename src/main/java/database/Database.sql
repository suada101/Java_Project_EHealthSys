/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  suada
 * Created: 20.02.2021
 */

insert into person (fname,adress,birthday,healthInfo,insuranceType,insuranceName,reminder,appointmentDate,email,password)values('Thomas', 'Phantasia Str.20', '10.02.1999', 'heart problems', 'private', 'aok', '3 days', '22.10.2021','Eckig@outlook.de', 'spongebob');
select * from person;
-- UPDATE PERSON: update person set password = "Ferrari" where person_id = 4; 
-- DELETE PERSON: delete from person where person_id = 6;