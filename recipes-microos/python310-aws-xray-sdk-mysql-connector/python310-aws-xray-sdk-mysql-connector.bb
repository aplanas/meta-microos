SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-mysql-connector-2.10.0-1.3.noarch.rpm"
RPM_HASH = "128ba422c3e6bdd2c656696942a3cdd8957efea0231566a7fde75da64a5f5e55e5f1d7ea18d1791874ddcce1b132a929f2a6efead730c88e73ca25b93245af5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-mysql-connector python310-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) python310-aws-xray-sdk python310-mysql-connector-python"

inherit rpm
