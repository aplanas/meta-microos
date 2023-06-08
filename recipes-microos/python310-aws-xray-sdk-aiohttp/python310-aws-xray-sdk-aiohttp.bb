SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-aiohttp-2.10.0-1.3.noarch.rpm"
RPM_HASH = "8cc5e96f54a986dff8abc3631bc9d0302220308f96f44b59b233e0da6f3ad2177de2f22404c707d0b3308ed05e45dd6c484d8c63810b72011d32526f8c4273ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-aiohttp python310-aws-xray-sdk-aiohttp"
RDEPENDS:${PN} += "python(abi) python310-aiohttp python310-aws-xray-sdk"

inherit rpm
