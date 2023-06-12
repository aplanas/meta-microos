SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.144"

RPM_NAME = "python311-botocore-1.29.144-1.1.noarch.rpm"
RPM_HASH = "b2943919b5f221946b54c0bc21862c9a1361a4406495559766d06a5b9e4bb7d7d4b1d9ee0449137398c20b2a768bff24cb57d751a5cb4f0969278076bb79f340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(botocore) python311-botocore python3dist(botocore)"
RDEPENDS:${PN} += "(python311-jmespath >= 0.7.1 with python311-jmespath < 2.0.0) (python311-python-dateutil >= 2.1 with python311-python-dateutil < 3.0.0) python(abi) python311-requests"

inherit rpm
