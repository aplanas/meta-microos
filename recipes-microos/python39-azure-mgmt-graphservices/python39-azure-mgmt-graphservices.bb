SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-graphservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "b9d6f83a2fc5ac1160e77389025ef1703bc27cdb39dd3b9aa33ebe78ed5511ee4c6432170ff588c5d51576c9630295658d5c3f82182222d1037ded27e4ff54e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-graphservices) python39-azure-mgmt-graphservices python3dist(azure-mgmt-graphservices)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
