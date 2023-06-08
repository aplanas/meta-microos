SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python310-s3transfer-0.6.0-1.5.noarch.rpm"
RPM_HASH = "6a319a0a89b5197ba6f02cb2533597639c9f014e4a215409c6b6ea1cd5c0f049b39082c1af9e1c89f357067e48262cd5659cb48bda8c67b31ac3df7268b273d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-s3transfer python3.10dist(s3transfer) python310-s3transfer python3dist(s3transfer)"
RDEPENDS:${PN} += "python(abi) python310-botocore python310-requests python310-urllib3"

inherit rpm
