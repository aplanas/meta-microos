SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-purview-nspkg-2.0.0-1.8.noarch.rpm"
RPM_HASH = "1728488a138c0594e188c1fb8d0b5f74957c7c12a6408d0b56c73d0d54525eb9c73f192ffe01e0367b6b3ebb5b2d75751b2aa0126585f983a4a4eb020e6d35ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-purview-nspkg) python39-azure-purview-nspkg python3dist(azure-purview-nspkg)"
RDEPENDS:${PN} += "python(abi) python39-azure-nspkg"

inherit rpm
