package com.axon1.axonapps.Interfaces;

import com.axon1.axonapps.models.Physiotherapy
import com.axon1.axonproviderapp.interfaces.Global_Interface

/**
 * Created by Mahmoud Sadek on 2/2/2019.
 */

public interface PhysiotherapyInterface : Global_Interface {
    fun onSuccess(result: Physiotherapy)
}