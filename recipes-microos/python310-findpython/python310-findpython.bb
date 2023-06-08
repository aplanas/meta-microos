SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python310-findpython-0.2.4-1.4.noarch.rpm"
RPM_HASH = "6318e7eb824cad0dd06448f93554ee968829100c64adc5df4ad4ad2e8c8f6e18a9487cd727a5a35e0c52f3bd9b69fc5bcc3fad58c1129c972b7f3b711bbbf1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-findpython python3.10dist(findpython) python310-findpython python3dist(findpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-packaging update-alternatives"

inherit rpm
