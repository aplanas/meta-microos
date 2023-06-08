SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-all-2.10.0-1.3.noarch.rpm"
RPM_HASH = "5429d07ed8febd72c438cd5f5c0bfbec6b05db4be7c5181c96185f19c70caab8216b4bafd8a27778ab67d8d3436e4e544a5186f3434c9c4ff461a39bfc453787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-all"
RDEPENDS:${PN} += "python311-aws-xray-sdk"

inherit rpm
