SUMMARY = "requests backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the requests backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-requests-2.10.0-1.3.noarch.rpm"
RPM_HASH = "d986a2a6bac9c9896ff2c1e098df3c59a53ddcf80c78b1988963f5b1352627fb005f8a25d1c868e6b0fcbb3221be913b690b807b96f2097fb5dddf42112ddfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-requests"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-requests"

inherit rpm
