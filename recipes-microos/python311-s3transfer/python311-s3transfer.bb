SUMMARY = "Python S3 transfer manager"
DESCRIPTION = "A transfer manager for Amazon Web Services S3"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python311-s3transfer-0.6.0-1.5.noarch.rpm"
RPM_HASH = "de2f01d67f8f625ecffd83d5b57cce202dc1851cc4e6a8488bffc6a5c51a23910c05a4538d9cee9d75f60f5d8f71da8416a194937288769471bd1236c77e6879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(s3transfer) python311-s3transfer python3dist(s3transfer)"
RDEPENDS:${PN} += "python(abi) python311-botocore python311-requests python311-urllib3"

inherit rpm
