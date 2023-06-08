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
Additional backends can be installed by installing python39-aws-xray-sdk-backend \
packages.  The python39-aws-xray-sdk-all package installs all backends."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-2.10.0-1.3.noarch.rpm"
RPM_HASH = "d989c71d291b48d50365ebedbbcf33f88701d4c7d807836b3237e57d442ccb45f0143a07a0e2ea0ff398484c94f7d512cfea12b531ff01532a421fffc9639988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(aws-xray-sdk) python39-aws-xray-sdk python3dist(aws-xray-sdk)"
RDEPENDS:${PN} += "python(abi) python39-botocore python39-wrapt"

inherit rpm
