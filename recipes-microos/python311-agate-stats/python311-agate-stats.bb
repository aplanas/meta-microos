SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python311-agate-stats-0.4.0-3.2.noarch.rpm"
RPM_HASH = "1b8fe02366526efed9636500bc24042f2ce5d59d8021259dcf7329d161bc96a6eb099b1b39f294b952c21e794892e6586b71f25fe40ed1575b9da014d566607d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(agate-stats) python311-agate-stats python3dist(agate-stats)"
RDEPENDS:${PN} += "python(abi) python311-agate python311-six"

inherit rpm
