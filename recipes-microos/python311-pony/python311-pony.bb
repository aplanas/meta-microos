SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python311-pony-0.7.16-2.2.noarch.rpm"
RPM_HASH = "4055e09835fddb0ed0afb15f909d55dc48f3abaeb18a1d2576116ea7830b16701a3c0a7273690059005d3852e7e1bcd168ccb2551fae7a73f9f27bbd394a888f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pony) \
python311-pony \
python3dist(pony)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm
