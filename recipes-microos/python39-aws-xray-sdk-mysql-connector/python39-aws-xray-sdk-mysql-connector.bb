SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-mysql-connector-2.12.0-1.1.noarch.rpm"
RPM_HASH = "b387c6314f0ba28a03946cefe9a86fcc7dd2c65d5212d8536f11545524895f523251d264b4edcad4d16a2d1779d61241a9952966c181802b5bc58ecaeea9477c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-mysql-connector-python"

inherit rpm
