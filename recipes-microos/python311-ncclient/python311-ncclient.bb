SUMMARY = "Python library for NETCONF clients"
DESCRIPTION = "ncclient is a Python library that facilitates client-side scripting \
and application development around the NETCONF protocol."
LICENSE = "Apache-2.0"

PV = "0.6.13"

RPM_NAME = "python311-ncclient-0.6.13-1.4.noarch.rpm"
RPM_HASH = "feeaf040a3cd097c52443b3d4b60f351fd8caaefdd97ceca830b1403d5df9f218aa7257c504eb7eb3587a687331320bc4b11c15d18429a6059b54220fbe5df01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ncclient) python311-ncclient python3dist(ncclient)"
RDEPENDS:${PN} += "python(abi) python311-lxml python311-paramiko python311-setuptools python311-six"

inherit rpm
