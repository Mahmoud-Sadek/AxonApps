package com.axon1.axonapps.models;

import com.google.gson.annotations.SerializedName;

public class Physiotherapy {
    @SerializedName("month")
    var Month: String = ""
    @SerializedName("visitorsCount")
    var VisitorsCount: Int = 0

    constructor() {

    }

    constructor(visitorsCount: Int, month: String) {
        this.Month = month
        this.VisitorsCount = visitorsCount
    }

}