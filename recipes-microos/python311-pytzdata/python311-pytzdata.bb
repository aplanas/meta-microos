SUMMARY = "The pytzdata module for Python-pendulum"
DESCRIPTION = "The Olson timezone database for Python. This version is linked to the systemwide zone info"
LICENSE = "MIT"

PV = "2020.1"

RPM_NAME = "python311-pytzdata-2020.1-1.16.aarch64.rpm"
RPM_HASH = "0ea93f6967db1fed8307d77debe9dfee26e15d3fec3fb12314e0fc0cd0bec37afbb798376c799d1009697542e471f931d360880234ef085b032de7bb97cad4af"

RPROVIDES:${PN} += "python3.11dist(pytzdata) python311-pytzdata python311-pytzdata(aarch-64) python3dist(pytzdata)"
RDEPENDS:${PN} += "python(abi) timezone"

inherit rpm
