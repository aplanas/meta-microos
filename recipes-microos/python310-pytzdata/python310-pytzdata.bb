SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python310-pytzdata-2020.1-1.16.aarch64.rpm"
RPM_HASH = "00e4650cb32813f964d3457c3eb8752c89ccc1e68494a311608fb8eae7fda098581479fc6988bc74eda6a49be0508a670d25876ab7629a6678f95187acd7ea92"

RPROVIDES:${PN} += "python3-pytzdata python3.10dist(pytzdata) python310-pytzdata python310-pytzdata(aarch-64) python3dist(pytzdata)"
RDEPENDS:${PN} += "python(abi) timezone"

inherit rpm
