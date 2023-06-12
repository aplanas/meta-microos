SUMMARY = "Microsoft Azure Key Vault Client Library"
DESCRIPTION = "This is the Microsoft Azure Key Vault libraries bundle. \
 \
This package does not contain any code in itself. It installs a set \
of packages that provide APIs for Key Vault operations: \
 \
- azure-keyvault-keys \
- azure-keyvault-secrets \
- azure-keyvault-certificates"
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-azure-keyvault-4.2.0-1.6.noarch.rpm"
RPM_HASH = "0c0eebaf7ce714bc4f0f7173592bf5e1229167a1225061047ab639af1b0b0b24fe1795132c52c3d74b924d6e217d12e388cffe6bafb0f0db75de77e81b3fa5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-keyvault) \
python39-azure-keyvault \
python3dist(azure-keyvault)"
RDEPENDS:${PN} += "python39-azure-keyvault-certificates \
python39-azure-keyvault-keys \
python39-azure-keyvault-nspkg \
python39-azure-keyvault-secrets \
python39-azure-nspkg"

inherit rpm
