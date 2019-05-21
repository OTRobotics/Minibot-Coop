/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;;

/**
 * Add your docs here
 */
public class OI {

    public static XboxController Right = new XboxController(0);
    public static XboxController Left = new XboxController(1);

    public static double getSpeedRight () {
        return Right.getTriggerAxis(Hand.kLeft) - Right.getTriggerAxis(Hand.kRight);
    }
    public static double getSpeedLeft () {
        return Left.getTriggerAxis(Hand.kLeft) - Left.getTriggerAxis(Hand.kRight);
    }


}
