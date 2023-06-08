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

RPM_NAME = "python311-azure-keyvault-secrets-4.7.0-1.2.noarch.rpm"
RPM_HASH = "d98e7a855a555e7d7f0819dddc0dcd7baf92fa13d2c7e6cd8049ae0990be0cfd203bc14307c3cf55f0bcc788bcbe16d6e85ce1ddc19eedf43948fb6d649fbb06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-keyvault-secrets) python311-azure-keyvault-secrets python3dist(azure-keyvault-secrets)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.0.1 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-core python311-azure-keyvault-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
