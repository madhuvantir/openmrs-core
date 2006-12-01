package org.openmrs.logic.rule;

import org.openmrs.Location;
import org.openmrs.Patient;
import org.openmrs.logic.LogicDataSource;
import org.openmrs.logic.Result;
import org.openmrs.logic.Rule;

public class HealthCenterRule extends Rule {

	@Override
	public Result eval(LogicDataSource dataSource, Patient patient,
			Object[] args) {
		Location healthCenter = patient.getHealthCenter();
		if (healthCenter == null)
			return Result.NULL_RESULT;
		Result result = new Result(healthCenter.getName());
		result.setValueNumeric(healthCenter.getLocationId());
		return result;
	}

}
