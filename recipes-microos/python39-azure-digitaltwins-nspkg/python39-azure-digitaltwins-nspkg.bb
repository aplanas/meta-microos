SUMMARY = "Microsoft Azure Digitaltwins Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.digitaltwins namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-digitaltwins-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "198956e81d99d6c8f9cd0a92cacbced72bea0ce4a8f691573b712dd6fcdd9bf8bf38076d7a6254385ee047866590d397256801add552733c4e177627b7cc41bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-digitaltwins-nspkg) python39-azure-digitaltwins-nspkg python3dist(azure-digitaltwins-nspkg)"
RDEPENDS:${PN} += "python(abi) python39-azure-nspkg"

inherit rpm
