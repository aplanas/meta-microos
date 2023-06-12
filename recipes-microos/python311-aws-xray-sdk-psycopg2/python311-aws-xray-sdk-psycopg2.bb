SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-psycopg2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "ac14ae8ffcccccca3a97272e60ff716956cfcfee7cd973fe1b6f9fd275a41b712e32b3607c6598034b2b4ce0cbb2edf98a1be41a724301bd063c8dc8b83f89d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-psycopg2"

inherit rpm
