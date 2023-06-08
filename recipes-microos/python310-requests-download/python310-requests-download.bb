SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-requests-download-0.1.2-2.14.noarch.rpm"
RPM_HASH = "97a9c54a24069c5e4c267f49994f90d6b28e7db61b60934fbfb9b509b5bfc398fb3f65f59c0fb0ad400355720d2cd0ac3a58a9930c347390df292253ae15273e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-download python3.10dist(requests-download) python310-requests-download python3dist(requests-download)"
RDEPENDS:${PN} += "python(abi) python310-progressbar python310-requests"

inherit rpm
