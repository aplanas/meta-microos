SUMMARY = "aiohttp backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the aiohttp backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-aiohttp-2.10.0-1.3.noarch.rpm"
RPM_HASH = "50309a43734a525b6f18be5b251a43bd1a2dc770d1baf6ed718f93f59442b68e5faf2648548bf3d3d88b171ad2a1f972dd215cafcba41bba31832be02fb88f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-aiohttp"
RDEPENDS:${PN} += "python(abi) python311-aiohttp python311-aws-xray-sdk"

inherit rpm
