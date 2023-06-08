SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-parver-0.4-1.2.noarch.rpm"
RPM_HASH = "be13d90689ec55361c482b3474238161da3fbc13acd860b84ab8baae3b6dd1aa7d423962a6913deeecfbdc8923601d7bc328388eeb1fbb1771b87743bee4e06a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parver python3.10dist(parver) python310-parver python3dist(parver)"
RDEPENDS:${PN} += "python(abi) python310-Arpeggio python310-attrs python310-typing_extensions"

inherit rpm
