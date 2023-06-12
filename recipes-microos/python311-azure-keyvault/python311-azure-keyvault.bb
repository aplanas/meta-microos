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

RPM_NAME = "python311-azure-keyvault-4.2.0-1.6.noarch.rpm"
RPM_HASH = "3c15be15f0c333fbe8d645fdc0099735795b4ee34081a7e2d03c84ca8174c931344127d20aa4998ff30d5c295cf77d0a719c7e36287ae34eda56466d8c3013eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-keyvault) \
python311-azure-keyvault \
python3dist(azure-keyvault)"
RDEPENDS:${PN} += "python311-azure-keyvault-certificates \
python311-azure-keyvault-keys \
python311-azure-keyvault-nspkg \
python311-azure-keyvault-secrets \
python311-azure-nspkg"

inherit rpm
