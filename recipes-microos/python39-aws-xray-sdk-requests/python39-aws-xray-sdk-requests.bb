SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-requests-2.12.0-1.1.noarch.rpm"
RPM_HASH = "41bd25bbcf06d37a8d190166e75cc90ea4e0b6d29cc65a5ee1da9e221efe58f6c10df3926d23cdc059c968d3a163d38a5a4ea9fa9c0f3ac5e697d814cfd5d3af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-requests"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-requests"

inherit rpm
