SUMMARY = "Python implementation of the Unicode Collation Algorithm"
DESCRIPTION = "This is a Python implementation of the Unicode Collation Algorithm (UCA). It \
passes 100% of the UCA conformances tests for Unicode 6.3.0 with a \
variable-weighting setting of Non-ignorable."
LICENSE = "MIT"

PV = "1.2"

RPM_NAME = "python310-pyuca-1.2-4.12.noarch.rpm"
RPM_HASH = "90fb87bd3c7026624b4ba36b884c4777b34cc1468392ae5e1964b49a78c0a0588568be171ccfb2bad939b03c3ead22dfcd21b402311502e403a94a5f41b3a26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyuca python3.10dist(pyuca) python310-pyuca python3dist(pyuca)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
