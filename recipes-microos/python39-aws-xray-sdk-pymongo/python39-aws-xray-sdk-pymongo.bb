SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-pymongo-2.10.0-1.3.noarch.rpm"
RPM_HASH = "e1b3de9e1e9106c8b89b0132991fa84b288a1f9a8f9d67f180e41d67003f5ab9f1e44835ed4ec80e03236023489d160564e448002ca5c7a44cc97d66d4aa67d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pymongo"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-pymongo"

inherit rpm
