SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-aiohttp-2.10.0-1.3.noarch.rpm"
RPM_HASH = "58d2a451bf261cd90d1231cea561ea7f9f817b5574d24acde658e037b809b94862c965da90b8ff83cb37b47593fc59d6fadb49baa23782f790531439b5da34b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-aiohttp"
RDEPENDS:${PN} += "python(abi) python39-aiohttp python39-aws-xray-sdk"

inherit rpm
