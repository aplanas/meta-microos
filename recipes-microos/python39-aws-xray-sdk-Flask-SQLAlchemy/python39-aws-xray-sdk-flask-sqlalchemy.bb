SUMMARY = "Flask-SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask-SQLAlchemy backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python39-aws-xray-sdk-Flask-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "c2eb4edd7eda05e4debe2752c500bfac31d93609426425a5a6cd3b7962a103c32d9dd180533e10b7a05051762dce521c968e6477c7c236b51d4d08a113199aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-Flask-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python39-Flask-SQLAlchemy python39-SQLAlchemy python39-aws-xray-sdk python39-aws-xray-sdk-SQLAlchemy"

inherit rpm
