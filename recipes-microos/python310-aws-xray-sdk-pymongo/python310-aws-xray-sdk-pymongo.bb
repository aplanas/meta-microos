SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-pymongo-2.10.0-1.3.noarch.rpm"
RPM_HASH = "486f89d6a35642d97dfed0d1c1671a7c362e6ab1b668590b77ef8c5ed139b98f26c8b77bbfde4308acb50e59ca6f6da427d2a2194e9ece858dd28d31f2ea0104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pymongo python310-aws-xray-sdk-pymongo"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-pymongo"

inherit rpm
