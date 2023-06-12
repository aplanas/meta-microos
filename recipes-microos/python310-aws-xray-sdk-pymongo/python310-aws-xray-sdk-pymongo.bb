SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-pymongo-2.12.0-1.1.noarch.rpm"
RPM_HASH = "adeb0bb2405039034079559f2764c5e4e7fa53373364800a28043559dd6d4aa8379d907358fda7f461fa3566f275ca3ce6840ac4b014e8008cb9ab1e7686a524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-pymongo \
python310-aws-xray-sdk-pymongo"
RDEPENDS:${PN} += "python(abi) \
python310-aws-xray-sdk \
python310-pymongo"

inherit rpm
