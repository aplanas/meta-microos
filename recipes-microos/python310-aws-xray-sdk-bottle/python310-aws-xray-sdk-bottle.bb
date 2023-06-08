SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-bottle-2.10.0-1.3.noarch.rpm"
RPM_HASH = "e731425c547f2c3b5488c0fbdd77ec584e976a4869ec021d392dfca5c930fb6d4edff709c0b8efbd76c38b4d357543b9ef1e5ce246c83a75d49ffd56271d2438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-bottle python310-aws-xray-sdk-bottle"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-bottle"

inherit rpm
