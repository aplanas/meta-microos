SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.115"

RPM_NAME = "python310-botocore-1.29.115-1.1.noarch.rpm"
RPM_HASH = "dff8c4a1c671a960b828b81a55a0886e4c304baee917adfcb9349bf86a0e1bdf072fa2cd9a0c822d43f49720d4c300814b233ed62ed7e1a4f30d25a4e15abe71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-botocore python3.10dist(botocore) python310-botocore python3dist(botocore)"
RDEPENDS:${PN} += "(python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0) (python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0) (python310-urllib3 >= 1.25.4 with python310-urllib3 < 1.27) python(abi) python310-requests"

inherit rpm
