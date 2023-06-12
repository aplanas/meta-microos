SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python310-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python310-aws-xray-sdk-SQLAlchemy-2.12.0-1.1.noarch.rpm"
RPM_HASH = "bc6ad4a7fe494cc6ccee4034db8a7dee9eb283ff323e0883134bdac159bd898a0f7def775ae362a623e07c3432c3040a0cb482fcaa4ed6158504f91c172957ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-SQLAlchemy python310-aws-xray-sdk-SQLAlchemy"
RDEPENDS:${PN} += "python(abi) python310-SQLAlchemy python310-aws-xray-sdk"

inherit rpm
