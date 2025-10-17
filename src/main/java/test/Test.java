package test;

import entities.Machine;
import entities.Salle;
import services.MachineService;
import services.SalleService;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SalleService salleService = new SalleService();
        MachineService machineService = new MachineService();

        Salle s1 = new Salle("A1");
        salleService.create(s1);

        Machine m1 = new Machine("M123", new Date(), s1);
        machineService.create(m1);

        for (Salle s : salleService.findAll()) {
            System.out.println("Salle: " + s.getCode());
            for (Machine m : s.getMachines()) {
                System.out.println("  Machine: " + m.getRef());
            }
        }
    }
}
