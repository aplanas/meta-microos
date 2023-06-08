SUMMARY = "Flask-SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the Flask-SQLAlchemy backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-Flask-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "ce4ec95f246992ba5a4a8201943542df38ee2b7ffaecf4bba6588682ab54629a965b705a50747802f88cd81036e4f5c3c16005e8896b46d0b7a67f6b2509eba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-Flask-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python311-Flask-SQLAlchemy python311-SQLAlchemy python311-aws-xray-sdk python311-aws-xray-sdk-SQLAlchemy"

inherit rpm
