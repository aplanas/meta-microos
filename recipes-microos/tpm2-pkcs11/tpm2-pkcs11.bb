SUMMARY = "A PKCS#11 interface for TPM2 hardware"
DESCRIPTION = "PKCS #11 is a Public-Key Cryptography Standard that defines a standard method to \
access cryptographic services from tokens/devices such as hardware security \
modules (HSM), smart cards, etc. This project uses a TPM2 device \
as the cryptographic token."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "tpm2-pkcs11-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "5b3580febd0da05aa43da0fc1b30b1603f55f3fcc8950ac4b453ca67d7e048cffc527f96b9751ef3821aca1d895e2f65e8ac4dd7dbc5aedbc4d4798886e2631a"

RPROVIDES:${PN} += "python3.10dist(tpm2-pkcs11-tools) python3dist(tpm2-pkcs11-tools) tpm2-pkcs11 tpm2-pkcs11(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3.10dist(bcrypt) python3.10dist(cryptography) python3.10dist(pyasn1) python3.10dist(pyasn1-modules) python3.10dist(pyyaml) python3.10dist(setuptools) python3.10dist(tpm2-pytss)"

inherit rpm
