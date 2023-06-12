SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-drms-0.6.2-1.10.noarch.rpm"
RPM_HASH = "af5c125d6af797d2b25c36e8555efffc8c699b65026830178b24a6aeb79b7f110f80e1e596d92ac5523a44577779acc3b82e4c16d863294ae0a779c8c293e10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(drms) \
python39-drms \
python3dist(drms)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-numpy \
python39-pandas \
update-alternatives"

inherit rpm
