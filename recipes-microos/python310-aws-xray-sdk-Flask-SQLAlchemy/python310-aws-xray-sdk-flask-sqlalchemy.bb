SUMMARY = "Flask-SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask-SQLAlchemy backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python310-aws-xray-sdk-Flask-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "9ea5b07cd29f38cccbcffc93ee18146e1de769b0f6826994a66b2282fa35f7ebcf285e2ba967eebcb0df2566be3207e1d855e63051b1ba0c2f0c8bcae7b94ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-Flask-SQLAlchemy python310-aws-xray-sdk-Flask-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python310-Flask-SQLAlchemy python310-SQLAlchemy python310-aws-xray-sdk python310-aws-xray-sdk-SQLAlchemy"

inherit rpm
