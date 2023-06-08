SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-requests-2.10.0-1.3.noarch.rpm"
RPM_HASH = "c29ed8f8dccb4ba00e29ce4e0dba60617819d27c46044a93968db1216560a41e19b473f3bfb292dde4ec2cc1216f8bae85b3c22086a1c6c9413432accb903d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-requests"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-requests"

inherit rpm
