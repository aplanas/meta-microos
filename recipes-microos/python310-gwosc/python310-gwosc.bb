SUMMARY = "Python interface to the Gravitational-Wave Open Data Center archive"
DESCRIPTION = "The gwosc package provides an interface to querying the open data \
releases hosted on https://gw-openscience.org from the GEO, LIGO, and \
Virgo gravitational-wave observatories."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python310-gwosc-0.6.1-2.4.noarch.rpm"
RPM_HASH = "6000b98867049e788b94e1e3954b6574cd36231aee4014dd86ba2e0c641e4cdcf817a5695666526fc373a0fe5de5ca2525eb9bbd448db30f7d48a0f932f474b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwosc python3.10dist(gwosc) python310-gwosc python3dist(gwosc)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
