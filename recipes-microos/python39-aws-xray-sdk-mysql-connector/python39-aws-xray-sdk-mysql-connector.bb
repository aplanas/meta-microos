SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-mysql-connector-2.10.0-1.3.noarch.rpm"
RPM_HASH = "9e32f8c8b8a0a8479efcefbf90967234ed433c23594010632b62f19ccc9f6a99cc997f58b74b498dd9f337a9bde68d08cc7f6a4a5558f22467595049a68cf6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-mysql-connector-python"

inherit rpm
