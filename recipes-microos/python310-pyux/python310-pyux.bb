SUMMARY = "Utility to check API integrity in python libraries"
DESCRIPTION = "Utility to check API integrity in Python libraries."
LICENSE = "MIT"

PV = "0.0.6"

RPM_NAME = "python310-pyux-0.0.6-1.14.noarch.rpm"
RPM_HASH = "d8f13461fcd258cd0918e068257b7e4aa72debc8e900052f69915e7e0c888be3ae2f4ee50c667d1be55aa4758edcaf4381684df4dec6ac1408a7607f2aeab262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyux \
python3.10dist(pyux) \
python310-pyux \
python3dist(pyux)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
