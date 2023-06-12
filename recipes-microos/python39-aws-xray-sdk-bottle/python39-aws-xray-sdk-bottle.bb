SUMMARY = "bottle backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the bottle backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-bottle-2.12.0-1.1.noarch.rpm"
RPM_HASH = "d419bbc7bb6cdaac0f6708687a041b539f8b569f257c5a12d6cdb29d6c9a8609d6a0f7a285130a3a2d9c1349d248a943033f617a479ab6bfcad4969a7470156a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-bottle"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-bottle"

inherit rpm
