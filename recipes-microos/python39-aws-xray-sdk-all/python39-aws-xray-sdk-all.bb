SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-all-2.10.0-1.3.noarch.rpm"
RPM_HASH = "37088baa9a47c77ca84cbe65495db1c95d83d0c3ab8bcf3020e83fcda803dacbb32c064985a49ff9c3e66b56d933eb670072ecb361b3c6a7f6c5264a9e8de3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-all"
RDEPENDS:${PN} += "python39-aws-xray-sdk"

inherit rpm
