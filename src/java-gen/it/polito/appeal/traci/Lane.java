

/*   
    Copyright (C) 2013 ApPeAL Group, Politecnico di Torino

    This file is part of TraCI4J.

    TraCI4J is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    TraCI4J is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with TraCI4J.  If not, see <http://www.gnu.org/licenses/>.
*/

/*
THIS FILE IS GENERATED AUTOMATICALLY. DO NOT EDIT: CHANGES WILL BE OVERWRITTEN.
*/

package it.polito.appeal.traci;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Lane 
extends TraciObject<Lane.Variable>
implements StepAdvanceListener
{

	/**
	 * Enumerates all the read queries. Each value can be used as an argument
	 * for {@link TraciObject#getReadQuery(Enum)}.
	 * 
	 * @author Enrico Gueli &lt;enrico.gueli@polito.it&gt;
	 */	
	public static enum Variable {
		
		/** 
		 * Query "ReadShape"
		 * @see {@link #queryReadShape}
		 */
		SHAPE,
		
		/** 
		 * Query "ReadLength"
		 * @see {@link #queryReadLength}
		 */
		LENGTH,
		
		/** 
		 * Query "ReadLastStepOccupancy"
		 * @see {@link #queryReadLastStepOccupancy}
		 */
		LAST_STEP_OCCUPANCY,
		
		/** 
		 * Query "ReadMaxSpeed"
		 * @see {@link #queryReadMaxSpeed}
		 */
		MAX_SPEED,
		
		/** 
		 * Query "ReadParentEdge"
		 * @see {@link #queryReadParentEdge}
		 */
		PARENT_EDGE,
		
		/** 
		 * Query "ReadLinks"
		 * @see {@link #queryReadLinks}
		 */
		LINKS,
		
		/** 
		 * Query "ReadLastStepVehicleNumber"
		 * @see {@link #queryReadLastStepVehicleNumber}
		 */
		LAST_STEP_VEHICLE_NUMBER,
		
		/** 
		 * Query "ReadCO2Emission"
		 * @see {@link #queryReadCO2Emission}
		 */
		CO2_EMISSION,
		
		/** 
		 * Query "ReadCOEmission"
		 * @see {@link #queryReadCOEmission}
		 */
		CO_EMISSION,
		
		/** 
		 * Query "ReadHCEmission"
		 * @see {@link #queryReadHCEmission}
		 */
		HC_EMISSION,
		
		/** 
		 * Query "ReadPMXEmission"
		 * @see {@link #queryReadPMXEmission}
		 */
		PMX_EMISSION,
		
		/** 
		 * Query "ReadNOXEmission"
		 * @see {@link #queryReadNOXEmission}
		 */
		NOX_EMISSION,
		
		/** 
		 * Query "ReadFuelConsumption"
		 * @see {@link #queryReadFuelConsumption}
		 */
		FUEL_CONSUMPTION,
		
		/** 
		 * Query "ReadNoiseEmission"
		 * @see {@link #queryReadNoiseEmission}
		 */
		NOISE_EMISSION,
		
	}
	
	Lane (
		DataInputStream dis,
		DataOutputStream dos, 
		String id
		
			, Repository<Edge> repoEdge
			, Repository<Lane> repoLane
	) {
		super(id, Variable.class);

		/*
		 * initialization of read queries
		 */
		
		addReadQuery(Variable.SHAPE, 
				new ReadShapeQuery (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_SHAPE
				
				));
		
		addReadQuery(Variable.LENGTH, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_LENGTH
				
				));
		
		addReadQuery(Variable.LAST_STEP_OCCUPANCY, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.LAST_STEP_OCCUPANCY
				
				));
		
		addReadQuery(Variable.MAX_SPEED, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_MAXSPEED
				
				));
		
		addReadQuery(Variable.PARENT_EDGE, 
				new ReadObjectVarQuery.EdgeQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.LANE_EDGE_ID
				, repoEdge
				
				));
		
		addReadQuery(Variable.LINKS, 
				new ReadLinksQuery (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.LANE_LINKS
				, repoLane
				
				));
		
		addReadQuery(Variable.LAST_STEP_VEHICLE_NUMBER, 
				new ReadObjectVarQuery.IntegerQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.LAST_STEP_VEHICLE_NUMBER
				
				));
		
		addReadQuery(Variable.CO2_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_CO2EMISSION
				
				));
		
		addReadQuery(Variable.CO_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_COEMISSION
				
				));
		
		addReadQuery(Variable.HC_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_HCEMISSION
				
				));
		
		addReadQuery(Variable.PMX_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_PMXEMISSION
				
				));
		
		addReadQuery(Variable.NOX_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_NOXEMISSION
				
				));
		
		addReadQuery(Variable.FUEL_CONSUMPTION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_FUELCONSUMPTION
				
				));
		
		addReadQuery(Variable.NOISE_EMISSION, 
				new ReadObjectVarQuery.DoubleQ (dis, dos, 
				it.polito.appeal.traci.protocol.Constants.CMD_GET_LANE_VARIABLE, 
				id, 
				it.polito.appeal.traci.protocol.Constants.VAR_NOISEEMISSION
				
				));
		

		/*
		 * initialization of change state queries
		 */
		
	
	}
	
	
	
	@Override
	public void nextStep(double step) {
		
		getReadQuery(Variable.LAST_STEP_OCCUPANCY).setObsolete();
		
		getReadQuery(Variable.LAST_STEP_VEHICLE_NUMBER).setObsolete();
		
		getReadQuery(Variable.CO2_EMISSION).setObsolete();
		
		getReadQuery(Variable.CO_EMISSION).setObsolete();
		
		getReadQuery(Variable.HC_EMISSION).setObsolete();
		
		getReadQuery(Variable.PMX_EMISSION).setObsolete();
		
		getReadQuery(Variable.NOX_EMISSION).setObsolete();
		
		getReadQuery(Variable.FUEL_CONSUMPTION).setObsolete();
		
		getReadQuery(Variable.NOISE_EMISSION).setObsolete();
		
	}
	
	
	
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.awt.geom.Path2D> queryReadShape() {
		return (ReadShapeQuery) getReadQuery(Variable.SHAPE);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Double> queryReadLength() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.LENGTH);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Double> queryReadLastStepOccupancy() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.LAST_STEP_OCCUPANCY);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Double> queryReadMaxSpeed() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.MAX_SPEED);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Edge> queryReadParentEdge() {
		return (ReadObjectVarQuery.EdgeQ) getReadQuery(Variable.PARENT_EDGE);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.util.List<Link>> queryReadLinks() {
		return (ReadLinksQuery) getReadQuery(Variable.LINKS);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<Integer> queryReadLastStepVehicleNumber() {
		return (ReadObjectVarQuery.IntegerQ) getReadQuery(Variable.LAST_STEP_VEHICLE_NUMBER);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadCO2Emission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO2_EMISSION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadCOEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.CO_EMISSION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadHCEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.HC_EMISSION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadPMXEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.PMX_EMISSION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadNOXEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOX_EMISSION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadFuelConsumption() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.FUEL_CONSUMPTION);
	}
	
	
	/**
	 * @return the instance of {@link ReadObjectVarQuery} relative to this query.
	 */
	public ReadObjectVarQuery<java.lang.Double> queryReadNoiseEmission() {
		return (ReadObjectVarQuery.DoubleQ) getReadQuery(Variable.NOISE_EMISSION);
	}
	
	
}

