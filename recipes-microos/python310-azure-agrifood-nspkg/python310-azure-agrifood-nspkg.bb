SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-agrifood-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "f35783436410de889b6c044a97ad5bffed91576ebb0cc7cc66e6007a653487f4cc8743bce0d978e86f4e217eb1f18d014f9d6e347d9cf45567cabd30895ebc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-agrifood-nspkg python3.10dist(azure-agrifood-nspkg) python310-azure-agrifood-nspkg python3dist(azure-agrifood-nspkg)"
RDEPENDS:${PN} += "python(abi) python310-azure-nspkg"

inherit rpm
