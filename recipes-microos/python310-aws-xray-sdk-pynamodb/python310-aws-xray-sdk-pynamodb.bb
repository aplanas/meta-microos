SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-pynamodb-2.10.0-1.3.noarch.rpm"
RPM_HASH = "c6cbdf68544465c2ef38a1fa926311f2e3d7acf58f03593d044b03a10ad692aae49f91458f5c8f1978e92a8827b8655d841d32e3f130be49bb5fbf4a07ec5b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pynamodb python310-aws-xray-sdk-pynamodb"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-pynamodb"

inherit rpm
