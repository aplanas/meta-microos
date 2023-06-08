SUMMARY = "Python 2 and 3 compatibility utilities"
DESCRIPTION = "Six is a Python 2 and 3 compatibility library. It provides utility \
functions for smoothing over the differences between the Python \
versions with the goal of writing Python code that is compatible on \
both Python versions. See the documentation for more information on \
what is provided."
LICENSE = "MIT"

PV = "1.16.0"

RPM_NAME = "python39-six-1.16.0-3.1.noarch.rpm"
RPM_HASH = "b2c21df976c83ff1a2c974bb1729c58a8006f251452b5e17bf27bdb7550fd7b16f0bf865d0b380882c2b16b84bc75be978ebc6a3d3bdeb9dc87727790bd3c0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(six) python39-six python3dist(six)"
RDEPENDS:${PN} += "/bin/sh python(abi)"

inherit rpm
