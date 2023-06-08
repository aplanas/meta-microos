SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python311-pyuca-1.2-4.12.noarch.rpm"
RPM_HASH = "98a499c08b4efd042e974a52b2edf483b77bfe1ac23cdd504421d5eb0e869cadbf614298949659bb3cccf4ded1064f1225330c8413329139495cc292816abb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyuca) python311-pyuca python3dist(pyuca)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
