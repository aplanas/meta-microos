SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-pynamodb-2.10.0-1.3.noarch.rpm"
RPM_HASH = "4a5ab67406560644443668b151330a3ea24e8d6cb33fd8408a750d86ded6276e087252bc55cb66a5bd25c983a4ebaf0881a96d38dbeb0e6c5e3ded24dbe9bd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pynamodb"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-pynamodb"

inherit rpm
