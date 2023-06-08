SUMMARY = "OpenStack DNS as a Service - Client"
DESCRIPTION = "OpenStack DNS as a Service - Client \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-designateclient-4.5.0-1.4.noarch.rpm"
RPM_HASH = "e376148b6a75c229b47d592f7ebd7f9db16b9205c774fa5676f05bb6b1da01909082a7fd87c0c391bfcb73d6378aeb4d36ef2a826994ff9ea3bf774e8c4911e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-designateclient python3.10dist(python-designateclient) python3dist(python-designateclient)"
RDEPENDS:${PN} += "python(abi) python3-cliff python3-debtcollector python3-jsonschema python3-keystoneauth1 python3-osc-lib python3-oslo.serialization python3-oslo.utils python3-requests python3-six python3-stevedore"

inherit rpm
