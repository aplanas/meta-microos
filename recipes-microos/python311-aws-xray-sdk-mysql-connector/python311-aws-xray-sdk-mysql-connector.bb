SUMMARY = "mysql backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the mysql-connector-python backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-mysql-connector-2.10.0-1.3.noarch.rpm"
RPM_HASH = "e656de88247cc08bb0c4d8ec3e585379f3c6ebacaa978246f5390e5d5bee3fd2899a52f57e7245a0155f77378c0afca2f07465e55c6bce4c774bf4004461c57f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-mysql-connector"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-mysql-connector-python"

inherit rpm
