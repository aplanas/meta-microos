SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python310-pytzdata-2020.1-3.1.noarch.rpm"
RPM_HASH = "2dc166773a81e3b3144c5fc004ab6aa3aa3ec4c9030c1ff4a0e151a99c118f5f1888c2b78060fa26566faff6149cac64175850c62b950c20fee75e58da02a5e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytzdata \
python3.10dist(pytzdata) \
python310-pytzdata \
python3dist(pytzdata)"
RDEPENDS:${PN} += "python(abi) \
timezone"

inherit rpm
