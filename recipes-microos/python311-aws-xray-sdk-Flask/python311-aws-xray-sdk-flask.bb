SUMMARY = "Flaks backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-Flask-2.12.0-1.1.noarch.rpm"
RPM_HASH = "18945adcccd52a28c7518d9b385af547164e9c17a40d0d6d0b96777364c569c52f05276416360741f1ba2c9f6879669c93b36b1c75c9a1784e5ffcca35580d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-Flask"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-aws-xray-sdk"

inherit rpm
