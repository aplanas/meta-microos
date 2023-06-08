SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-marathon-0.13.0-2.6.noarch.rpm"
RPM_HASH = "4c883707b42f4c05cd8021b7063ef849db556c7aaf2661416a6b68abf47689fadd852b872ca3b43ae86f575f9e1acf7d1b18be07563931733104345a3234b0c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(marathon) python311-marathon python3dist(marathon)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-requests-toolbelt"

inherit rpm
