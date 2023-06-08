SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-bottle-2.10.0-1.3.noarch.rpm"
RPM_HASH = "0df7243e20aa21fa8a1c5debe255a9acdf1c29125b6b54b346b22f042e88e3d73e322158de070bca9bbaac1260a98f901796c14cb24b838d3480856d5c496506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-bottle"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-bottle"

inherit rpm
