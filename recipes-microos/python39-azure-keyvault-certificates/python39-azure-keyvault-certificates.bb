SUMMARY = "Microsoft Azure Key Vault Certificates Client Library for Python"
DESCRIPTION = "Azure Key Vault helps solve the following problems: \
 \
Certificate management (this library) - create, manage, and deploy public and \
private SSL/TLS certificates Cryptographic key management (azure-keyvault-keys) \
- create, store, and control access to the keys used to encrypt your data Secrets \
management (azure-keyvault-secrets) - securely store and control access to tokens, \
passwords, certificates, API keys, and other secrets."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python39-azure-keyvault-certificates-4.7.0-1.2.noarch.rpm"
RPM_HASH = "78907e3efb2ab4792a53ba4ecd816ce6d0101e482921fb3336bf2473c4581629fc5733d276af04280b96619ae41ac159f19fb68c2a60e5d5eca150c9316beebd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-keyvault-certificates) python39-azure-keyvault-certificates python3dist(azure-keyvault-certificates)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-core python39-azure-keyvault-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
