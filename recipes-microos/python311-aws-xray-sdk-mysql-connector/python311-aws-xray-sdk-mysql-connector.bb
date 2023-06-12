SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-mysql-connector-2.12.0-1.1.noarch.rpm"
RPM_HASH = "9dd40e48d6ac60b26a47198ed4239bd16a08a30e0d46894032cc11de7d63c94ad65021549f8c46ce7957b46c789b08718855958f326ce1ad582dec88f071ceac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) \
python311-aws-xray-sdk \
python311-mysql-connector-python"

inherit rpm
