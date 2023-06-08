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

RPM_NAME = "python39-azure-keyvault-secrets-4.7.0-1.2.noarch.rpm"
RPM_HASH = "aca23c692ca5efafd37b5d6d5dace94adeec984f15345f5054c3db3963d49e742314cbb664fd6cf41a7b081d485d5b128ef77209ae75824759bcaf3889d8d2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-keyvault-secrets) python39-azure-keyvault-secrets python3dist(azure-keyvault-secrets)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.0.1 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-core python39-azure-keyvault-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
