package br.com.dio.coinconverter.data.model

import java.util.*

enum class Coin(val locale: Locale) {
    USD(Locale.US),
    CAD(Locale.CANADA),
    BRL(Locale("pt", "BR")),
    ARS(Locale("es", "AR")),
    GBP(Locale.UK),
    EUR(Locale("en","EU")),
    JPY(Locale.JAPAN),
    AUD(Locale("en","AU")),
    CNY(Locale.CHINA),
    ILS(Locale("en","IL"))
    ;

    companion object {
        fun getByName(name: String) = values().find { it.name == name } ?: BRL
    }
}