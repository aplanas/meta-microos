SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-bottle-2.10.0-1.3.noarch.rpm"
RPM_HASH = "df8a7f37568fd96af2af0d9642aaf4abd42503c59017c35365f041262c6356a4608a6e739879619b44826bdda0a50188c5f617c30e31083e9819934374310646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-bottle"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-bottle"

inherit rpm
