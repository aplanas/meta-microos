SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python39-findpython-0.2.4-1.4.noarch.rpm"
RPM_HASH = "5fc7fdd989741bbca2a0cd2021597166d465601d1e466dac92439ed040bf4ba442d5f5e03f8b4c025c60c4cc0f72752ece098cc01f7340836d8fc000d90f0bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(findpython) python39-findpython python3dist(findpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-packaging update-alternatives"

inherit rpm
