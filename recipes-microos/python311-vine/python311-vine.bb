SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python311-vine-5.0.0-2.3.noarch.rpm"
RPM_HASH = "76587124bd5f48678591c4134cce372c7189b2d30bc2b3935f7a96196c67d1c796cbc4a6ef5cc3d086f01e702477f9565ac0e0ffbd504850300c62aeeebe8c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vine) python311-vine python3dist(vine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
