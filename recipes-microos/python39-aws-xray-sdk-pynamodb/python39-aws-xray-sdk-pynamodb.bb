SUMMARY = "pynamodb backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the pynamodb backend for python39-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-pynamodb-2.12.0-1.1.noarch.rpm"
RPM_HASH = "d48be124812b6a5c782e6a621bafd4595aca61c461c7243744588ae3b950aec19810d1405f29ac4f68050b1d4bba58a63a1d5ab9e186a83aa3e12f5bbf65937c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-pynamodb"
RDEPENDS:${PN} += "python(abi) python39-aws-xray-sdk python39-pynamodb"

inherit rpm
