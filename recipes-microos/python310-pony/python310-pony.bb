SUMMARY = "Pony Object-Relational Mapper"
DESCRIPTION = "Pony ORM is a object-relational mapper for Python. Using Pony, users \
can create and maintain database-oriented software applications. Pony \
is able to write queries to the database using generator expressions. \
Pony then analyzes the abstract syntax tree of a generator and \
translates it to its SQL equivalent."
LICENSE = "Apache-2.0"

PV = "0.7.16"

RPM_NAME = "python310-pony-0.7.16-2.2.noarch.rpm"
RPM_HASH = "44159f0b24c3a81ceea1a0ecacc8ef698d1034e9dc980c4f75ef5017e8bb235e67c876d780301df6fd37070c341f771e67c05d3eae2c016e706f520b9578078a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pony \
python3.10dist(pony) \
python310-pony \
python3dist(pony)"
RDEPENDS:${PN} += "python(abi) \
python310"

inherit rpm
