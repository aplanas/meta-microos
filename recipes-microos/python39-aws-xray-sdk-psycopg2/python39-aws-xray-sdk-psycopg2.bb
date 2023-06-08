SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-psycopg2-2.10.0-1.3.noarch.rpm"
RPM_HASH = "c737d561c076fdf111ec26bd6b8d1d18a7a2831cb18d2b3815828a1715666153541addc5913874b1b7e61efda8509312c96677bceeaf531d51e9e764640957e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-psycopg2"

inherit rpm
