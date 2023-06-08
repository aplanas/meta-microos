SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python39-pytzdata-2020.1-1.16.aarch64.rpm"
RPM_HASH = "c3e428e98582eea4c7d88e3f2c99b198e8c923deaf3391ae04a0f96ba6531272be6b91a51a07eacd825dd55abb9bbb8147995e71361b8cb213f357400e36c429"

RPROVIDES:${PN} += "python3.9dist(pytzdata) python39-pytzdata python39-pytzdata(aarch-64) python3dist(pytzdata)"
RDEPENDS:${PN} += "python(abi) timezone"

inherit rpm
