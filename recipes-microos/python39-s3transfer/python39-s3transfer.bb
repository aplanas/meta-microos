SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python39-s3transfer-0.6.0-1.5.noarch.rpm"
RPM_HASH = "e2ee9dd507f6a8377081156e12efa0bb85c51029291280c6ddc9177b20007d43191c7c30c10de586ad9a10dcd384c05a4bd6291316ef15c1f31b7722b247234d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(s3transfer) python39-s3transfer python3dist(s3transfer)"
RDEPENDS:${PN} += "python(abi) python39-botocore python39-requests python39-urllib3"

inherit rpm
