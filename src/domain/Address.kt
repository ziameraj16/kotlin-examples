package domain

class Address {
    var name: String = "Address name"
    var street: String = "Street"
    var city: String = "London"

    fun copyAddress(address: Address): Address {
        val newAddress = Address()
        newAddress.name = address.name
        newAddress.street = address.street
        newAddress.city = address.city
        return newAddress
    }

    override fun toString(): String {
        return "Address(name='$name', street='$street', city='$city')"
    }


}

