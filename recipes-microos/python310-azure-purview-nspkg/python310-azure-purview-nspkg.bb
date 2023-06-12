SUMMARY = "Microsoft Azure Purview Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Purview namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.purview namespace."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-purview-nspkg-2.0.0-1.8.noarch.rpm"
RPM_HASH = "68326e3ae34420b29511bad6f134b05af172815f63849cd6c6ef7456a4c824e834ba455c07e4ecb546c5a96ffe2f862be5d50f02401c4726db51fc16858c2b81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-purview-nspkg \
python3.10dist(azure-purview-nspkg) \
python310-azure-purview-nspkg \
python3dist(azure-purview-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-nspkg"

inherit rpm
