SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python311-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-all-2.12.0-1.1.noarch.rpm"
RPM_HASH = "211feb733de752d8c0981f2041273ce94ba6b9b970e3784de7ad55668a6147d88571a1c9a089ebead1cc5229dd4e6955aaab0abb9ebb33c6d6c79265727d2881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-all"
RDEPENDS:${PN} += "python311-aws-xray-sdk"

inherit rpm
