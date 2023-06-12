SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python310-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-all-2.12.0-1.1.noarch.rpm"
RPM_HASH = "373a1b163b40f78e2b3e384f938537e8ade4cc74f69ce9270cbc6d362582c37ed2e4ffc49592a2d5ecb3945b48d20c8041bbab3c189e40b4c6be78c35dc9b799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-all \
python310-aws-xray-sdk-all"
RDEPENDS:${PN} += "python310-aws-xray-sdk"

inherit rpm
