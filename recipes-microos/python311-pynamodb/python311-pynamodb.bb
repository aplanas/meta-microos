SUMMARY = "Python Interface to DynamoDB"
DESCRIPTION = "A Python interface for Amazon's DynamoDB."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python311-pynamodb-5.3.4-1.2.noarch.rpm"
RPM_HASH = "c8ec8ca2cac4de35a4789438b468ebcf16cbbf8ba2bf6fd997859f7ab344f557aa52e6ffc4d2df560b6901b5e45feb3274617d881abacdb5e07d2f8b55a64448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pynamodb) python311-pynamodb python3dist(pynamodb)"
RDEPENDS:${PN} += "python(abi) python311-botocore python311-python-dateutil"

inherit rpm
