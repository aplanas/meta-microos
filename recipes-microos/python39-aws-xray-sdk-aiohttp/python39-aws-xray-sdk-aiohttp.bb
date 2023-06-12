SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-aiohttp-2.12.0-1.1.noarch.rpm"
RPM_HASH = "fb6aaed3809c7231ca4617b8f992382969dde123207b8584129d363bfa4e8a39c36524bf44c22022b2b0eebd935176e762bc20935b029631466e962773d8740f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-aiohttp"
RDEPENDS:${PN} += "python(abi) \
python39-aiohttp \
python39-aws-xray-sdk"

inherit rpm
