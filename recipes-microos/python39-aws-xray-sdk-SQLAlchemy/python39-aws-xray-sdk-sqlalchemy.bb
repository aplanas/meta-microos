SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "2ddd3079175f65e0b47443d9d7c253321215faa2d4ad6173bbe561013b53f76b5cacef05faa24629a6398668679bf5b2d6e874ccad8b196a2cc03f334b80b916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python39-SQLAlchemy python39-aws-xray-sdk"

inherit rpm
