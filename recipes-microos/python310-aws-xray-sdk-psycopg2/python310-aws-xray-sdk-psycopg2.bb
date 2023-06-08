SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-psycopg2-2.10.0-1.3.noarch.rpm"
RPM_HASH = "300c564d4773cc39c19673cb610344be8270f771c0f45b0fe182bc3c88c1fc88c6094beab1b7c60b1622ab44e5c9c899ebf2f4ab9b7cde26b273581d09e938a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-psycopg2 python310-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-psycopg2"

inherit rpm
