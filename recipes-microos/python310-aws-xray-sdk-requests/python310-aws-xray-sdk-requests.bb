SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-requests-2.10.0-1.3.noarch.rpm"
RPM_HASH = "09f3563001bf58ba0e8993825181dba37c1124f326ade9e815abb9005bb8eb85db73833ecfd7987d3a41df201b20fb7bcbfd9a7c0e6d30145c6effd5d8d47282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-requests python310-aws-xray-sdk-requests"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-requests"

inherit rpm
