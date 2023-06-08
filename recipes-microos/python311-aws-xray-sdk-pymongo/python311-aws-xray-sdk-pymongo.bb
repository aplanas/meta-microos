SUMMARY = "pymongo backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pymongo backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-pymongo-2.10.0-1.3.noarch.rpm"
RPM_HASH = "2dbe6d8ff6bbf45583be55303e5e6f4498166c6d1eca952fae6a15949108b83c2e2241d1393d1eac9a66f9a58bbbbec5724b66cde1b9cc43f3aeeba02e5d3f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-pymongo"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-pymongo"

inherit rpm
