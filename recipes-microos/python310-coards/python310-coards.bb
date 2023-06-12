SUMMARY = "A parser for COADS-compliant dates"
DESCRIPTION = "This module parses time values represented using the COARDS \
convention."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "python310-coards-1.0.5-2.14.noarch.rpm"
RPM_HASH = "51fb7278eefa0fd8285c8670d82010e585e92f702889e31def827c67aa1a7350af04f84b051c531d07ddfd1a2d7cc64455f29ad3952386166d5b8b32bb8e276e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coards \
python3.10dist(coards) \
python310-coards \
python3dist(coards)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
