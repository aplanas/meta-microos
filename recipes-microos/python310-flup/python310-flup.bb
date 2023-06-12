SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python310-flup-1.0.3.dev20161029-3.1.noarch.rpm"
RPM_HASH = "f74837d97176c3fda299aae6b92b5a7715f4037aec95d870d4d83973a502119f5ea6297ce606b2610ac04964efcaab50f7d1e95cd15c05e4a114a113233f5b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flup python3.10dist(flup) python310-flup python3dist(flup)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
