SUMMARY = "A few extensions to pyyaml"
DESCRIPTION = "A few extensions to pyyaml."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-aspy.yaml-1.3.0-2.8.noarch.rpm"
RPM_HASH = "03ba13c35e94fd9b5d216888ae139a591f161d52013415e05dc66031bcdd94ccf7468618526225f579f39e0210ea6135afe9c2c0fed67f6748e03df423c71fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aspy.yaml) \
python311-aspy.yaml \
python3dist(aspy.yaml)"
RDEPENDS:${PN} += "python(abi) \
python311-PyYAML"

inherit rpm
