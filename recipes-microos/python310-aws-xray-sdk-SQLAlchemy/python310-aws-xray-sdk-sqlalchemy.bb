SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "2418f34c35bab1e76157ee2f745de7ec2a6d4cb1299b148d9dc3d5b8966e72417913ac96dde21a58d23d5f56bdc5739df833e46fe32eee837ac2978ce1129c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-SQLAlchemy python310-aws-xray-sdk-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python310-SQLAlchemy python310-aws-xray-sdk"

inherit rpm
