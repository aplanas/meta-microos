SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python311-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "python311-aws-xray-sdk-SQLAlchemy-2.10.0-1.3.noarch.rpm"
RPM_HASH = "ba5abc5976f53fbfa96581908ea67fd32d39c0c4e5a49b417063f61bcec9781537c7fa5df4fe64e2a77a7f9cb1afc21e5cf910d33666afdc6c1c1f3e7391114d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-aws-xray-sdk-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python311-SQLAlchemy python311-aws-xray-sdk"

inherit rpm
