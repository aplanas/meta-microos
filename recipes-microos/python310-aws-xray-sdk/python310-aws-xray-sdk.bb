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
Additional backends can be installed by installing python310-aws-xray-sdk-backend \
packages.  The python310-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-2.10.0-1.3.noarch.rpm"
RPM_HASH = "d71f601c4963a6ebe9121f9853dc1ee785060b3dd92fb106aec133840f8aa08129bdc74199501f34aecee1239a85112a4d69e165b4a5ca08eb0ca29d8834caa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk python3.10dist(aws-xray-sdk) python310-aws-xray-sdk python3dist(aws-xray-sdk)"
RDEPENDS:${PN} += "python(abi) python310-botocore python310-wrapt"

inherit rpm
