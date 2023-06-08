SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-psycopg2-2.10.0-1.3.noarch.rpm"
RPM_HASH = "1832797dcb4b321bc933fc6ab932c2e15ed73c13a3f8c6a89411419748c83bc51a437d027da3c89c9ee36af04f8b6b29c60f9c6c9337618aaf8c52fae5c6bb6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-psycopg2"

inherit rpm
