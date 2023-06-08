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

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-2.10.0-1.3.noarch.rpm"
RPM_HASH = "4e683dbb351653ce114da85333de4b0a98d82ed169cd25ab7f6463c8e884cec9c951b8d9000cb618b235f2230c0f77950b4e936fe8cb4253d2013f34cc650244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aws-xray-sdk) python311-aws-xray-sdk python3dist(aws-xray-sdk)"
RDEPENDS:${PN} += "python(abi) python311-botocore python311-wrapt"

inherit rpm
