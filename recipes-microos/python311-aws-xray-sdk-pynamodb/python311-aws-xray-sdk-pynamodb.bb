SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-pynamodb-2.10.0-1.3.noarch.rpm"
RPM_HASH = "f65104bdd1b2a22896b352319a6307c872d8260fe14a3287ac688e716b97072800bf27052c117c42f124b8dac3b741e34f49d8f6e3be8c3afa9931971441df92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-pynamodb"
RDEPENDS:${PN} += "python(abi) python311-aws-xray-sdk python311-pynamodb"

inherit rpm
