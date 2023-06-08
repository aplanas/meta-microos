SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python39-gwosc-0.6.1-2.4.noarch.rpm"
RPM_HASH = "5ed19d30140acaead32db46af58e90aa130141ccb9d592b5834e841df3ec6d934951551b63856e96e3f7b10ae721e71c87937bbf4982aa3c545de23e878efe5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gwosc) python39-gwosc python3dist(gwosc)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
