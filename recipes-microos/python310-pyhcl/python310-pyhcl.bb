SUMMARY = "HCL configuration parser for python"
DESCRIPTION = "HCL configuration parser for python"
LICENSE = "MPL-2.0"

PV = "0.4.4"

RPM_NAME = "python310-pyhcl-0.4.4-2.14.noarch.rpm"
RPM_HASH = "8f5deaf2a721606b8b0bd633f8259ce3b1db3df7f24267b0454b9696bfa1abfa344246de4582a4ee1133f704f9c4c7fd0e1f7f94fae3924794fade425fb59f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhcl \
python3.10dist(pyhcl) \
python310-pyhcl \
python3dist(pyhcl)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
update-alternatives"

inherit rpm
