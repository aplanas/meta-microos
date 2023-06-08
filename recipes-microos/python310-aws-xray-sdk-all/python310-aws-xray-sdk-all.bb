SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-all-2.10.0-1.3.noarch.rpm"
RPM_HASH = "ff14ffacb166171edebe70d9602ff364a4435cc13a09ec282121f03bd90a8aee6b5f71b3c68971119ba655343e05e1aa3dc7b0063ae6336fb1e076c68aaae533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-all python310-aws-xray-sdk-all"
RDEPENDS:${PN} += "python310-aws-xray-sdk"

inherit rpm
