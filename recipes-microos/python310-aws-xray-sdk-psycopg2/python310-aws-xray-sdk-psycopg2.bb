SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-psycopg2-2.12.0-1.1.noarch.rpm"
RPM_HASH = "ea9f5526a53d54dd46b64e612d321365538a209eb12cf73b23cff096356d3ec74ac653d041291b486e36604eb2b3e4785cd46192c8f74c620a19fb9c68849396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-psycopg2 \
python310-aws-xray-sdk-psycopg2"
RDEPENDS:${PN} += "python(abi) \
python310-aws-xray-sdk \
python310-psycopg2"

inherit rpm
