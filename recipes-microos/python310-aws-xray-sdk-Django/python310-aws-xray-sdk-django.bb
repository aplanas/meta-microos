SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-Django-2.10.0-1.3.noarch.rpm"
RPM_HASH = "dcf1f62b91877ab51ebda52dfaecd0c7bb42cb3d3eca2c77c92c01a152ce7b5792bbecaec0a2cb26bd4b85f94fd7a993efe205f9ea03d943d84cccdf1845b83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Django python310-aws-xray-sdk-Django"
RDEPENDS:${PN} += "python(abi) python310-Django python310-aws-xray-sdk"

inherit rpm
