SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-Django-2.12.0-1.1.noarch.rpm"
RPM_HASH = "006119c0e51a8c059caadf7ac97f3033509e7b09469738e241d73c54f24b91d03f4601c11118ac70041204ddb49007ef0afcf23451f037e3469c485f26604a82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Django \
python310-aws-xray-sdk-Django"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-aws-xray-sdk"

inherit rpm
