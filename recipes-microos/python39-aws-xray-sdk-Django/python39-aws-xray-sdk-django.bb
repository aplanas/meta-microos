SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-Django-2.10.0-1.3.noarch.rpm"
RPM_HASH = "89060c6b0e443714b84f2bf9311862fd7bc0d48853e3c5eb629b87ed2c51a4eda5ead6e1ecef981579ea9997d47f1ded55b6ed41a194a14329acc2a8fcbe5e2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Django"
RDEPENDS:${PN} += "python(abi) python39-Django python39-aws-xray-sdk"

inherit rpm
