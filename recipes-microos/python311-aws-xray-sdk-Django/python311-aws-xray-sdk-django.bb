SUMMARY = "Django backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Django backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-Django-2.10.0-1.3.noarch.rpm"
RPM_HASH = "926ec5a9a153bebe60925cde22c77c974b34f8bd5c8f4adca85b4e11b774d448e3c1e7ac84e8f5ad2327ae6b5b498f31a9eebc91d76d0971e7790a033bfdaf84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-Django"
RDEPENDS:${PN} += "python(abi) python311-Django python311-aws-xray-sdk"

inherit rpm
