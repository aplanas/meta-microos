SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-aiohttp-2.12.0-1.1.noarch.rpm"
RPM_HASH = "4cc676eeeeec4be26ab0210dc623a24ab3a70bdd8e32ac593a41cb7b0787191c840e94a68b685f0184e43a50254a6b7f49b9585043bf8b15ff58c83405b6c654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-aiohttp python310-aws-xray-sdk-aiohttp"
RDEPENDS:${PN} += "python(abi) python310-aiohttp python310-aws-xray-sdk"

inherit rpm
