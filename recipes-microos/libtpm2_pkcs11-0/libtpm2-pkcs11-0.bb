SUMMARY = "A PKCS#11 interface for TPM2 hardware"
DESCRIPTION = "PKCS #11 is a Public-Key Cryptography Standard that defines a standard method to \
access cryptographic services from tokens/devices such as hardware security \
modules (HSM), smart cards, etc. This project uses a TPM2 device \
as the cryptographic token."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "libtpm2_pkcs11-0-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "6de0bf92c840d7ae939ef92344266b2aa7bb66f9dbd6c28a36d00c777cd63838bc07601df1a8a0701b04871844f4ca5484db9236a60297f95d80c2bf53bf1304"

RPROVIDES:${PN} += "libtpm2_pkcs11-0 libtpm2_pkcs11-0(aarch-64) libtpm2_pkcs11.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libsqlite3.so.0()(64bit) libtss2-esys.so.0()(64bit) libtss2-fapi.so.1()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-tctildr.so.0()(64bit) libyaml-0.so.2()(64bit) tpm2-pkcs11"

inherit rpm
