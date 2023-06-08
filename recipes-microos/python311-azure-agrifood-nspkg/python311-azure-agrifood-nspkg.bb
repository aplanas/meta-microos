SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-agrifood-nspkg-1.0.0-1.8.noarch.rpm"
RPM_HASH = "900c9b2ca6c05758c2bfd6438c17443c289da3c85ed73a52148352830d47345c2d5c06264bafad2b6dcb89daa5710e13666973efd8516a98ffbf06e570cea4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-agrifood-nspkg) python311-azure-agrifood-nspkg python3dist(azure-agrifood-nspkg)"
RDEPENDS:${PN} += "python(abi) python311-azure-nspkg"

inherit rpm
