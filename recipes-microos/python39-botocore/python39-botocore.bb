SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.115"

RPM_NAME = "python39-botocore-1.29.115-1.1.noarch.rpm"
RPM_HASH = "7954aa61dcfd43ec4cc3ff67e6d55406ba68d801e74b1faa8dd4ad39570cf560b4d851fa0fea8fa0bc2a6868b29be89b627ca8e6ce3c12bee3b89901fdb19676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(botocore) python39-botocore python3dist(botocore)"
RDEPENDS:${PN} += "(python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0) (python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0) (python39-urllib3 >= 1.25.4 with python39-urllib3 < 1.27) python(abi) python39-requests"

inherit rpm
