SUMMARY = "A declarative parser/builder for binary data"
DESCRIPTION = "Construct is a declarative parser (and builder) for binary data. \
 \
Instead of writing imperative code to parse a piece of data, a data \
structure that describes the data is declared. As this data structure is not \
code, it can be used in one direction to parse data into Pythonic objects, \
and in the other direction to convert ('build') objects into binary data."
LICENSE = "MIT"

PV = "2.10.68"

RPM_NAME = "python39-construct-2.10.68-1.6.noarch.rpm"
RPM_HASH = "53618c1dc98235bd515a7d46ef0fb69a451d0d5eda04d9727ac5405affff491c164c8eaae580bbbe9c014cfe8e7389116f798a4ada7b8c592340585d97a83a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(construct) \
python39-construct \
python3dist(construct)"
RDEPENDS:${PN} += "python(abi) \
python39-arrow"

inherit rpm
