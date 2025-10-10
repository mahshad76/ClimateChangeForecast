package com.mahshad.network.models.forecast

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ForecastDayDTO(
    @SerialName("date")
    val date: String? = null,
    @SerialName("date_epoch")
    val dateEpoch: Long? = null,
    @SerialName("day")
    val day: DayDTO? = null,
    @SerialName("astro")
    val astro: AstroDTO? = null,
    @SerialName("hour")
    val hour: List<HourDTO?>? = null,
) {
    companion object {
        val DEFAULT = ForecastDayDTO(
            "",
            0L,
            DayDTO.DEFAULT,
            AstroDTO.DEFAULT,
            listOf(HourDTO.DEFAULT)
        )
    }
}