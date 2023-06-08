SUMMARY = "Utility to find python versions on your system"
DESCRIPTION = "Discover which versions of the Python interpreter are present on your \
system."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python311-findpython-0.2.4-1.4.noarch.rpm"
RPM_HASH = "818eb559266246413b871e373d3f04d2eb69118288d8389aff8df0cd35e84e5c2d9612516c1591d2b812fd59fe8cba90176560fcfc44edf4b779d523970e7e58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(findpython) python311-findpython python3dist(findpython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-packaging update-alternatives"

inherit rpm
