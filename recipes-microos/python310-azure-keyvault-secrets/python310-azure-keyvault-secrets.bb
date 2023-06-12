SUMMARY = "Microsoft Azure Key Vault Secrets Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
* Secrets management (this library) - securely store and control \
  access to tokens, passwords, certificates, API keys, and other secrets \
* Cryptographic key management (azure-keyvault-keys) - create, store, \
  and control access to the keys used to encrypt your data \
* Certificate management (azure-keyvault-certificates) - create, \
  manage, and deploy public and private SSL/TLS certificates"
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python310-azure-keyvault-secrets-4.7.0-1.2.noarch.rpm"
RPM_HASH = "a99bfe248de7747234ae738f3a944000fe9d2bcbbe5ec3456ee673cc829fce69c460178bb3acb9e329209227f40f4dedce4bf48e56a2f3e51d458a304c22842c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-keyvault-secrets \
python3.10dist(azure-keyvault-secrets) \
python310-azure-keyvault-secrets \
python3dist(azure-keyvault-secrets)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.0.1 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-core \
python310-azure-keyvault-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
