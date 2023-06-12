SUMMARY = "The AWS X-Ray SDK for Python"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
It works through any one of various frameworks, provided by backends. The \
following backends are included in the main package: \
 \
  * botocore \
  * httplib \
  * sqlite3 \
 \
Additional backends can be installed by installing python311-aws-xray-sdk-backend \
packages.  The python311-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-2.12.0-1.1.noarch.rpm"
RPM_HASH = "975bb8915cd47b7de5f342751390efc5a886933d086c125c8cf49e482560c345991b5316db7f96d2ceeaf28a72b7982de28863b6b2e1caaf9b0e44b5aa9ac23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aws-xray-sdk) python311-aws-xray-sdk python3dist(aws-xray-sdk)"
RDEPENDS:${PN} += "python(abi) python311-botocore python311-wrapt"

inherit rpm
