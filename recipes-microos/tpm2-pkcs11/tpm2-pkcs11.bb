SUMMARY = "A PKCS#11 interface for TPM2 hardware"
DESCRIPTION = "tpm2-pkcs11 is a plugin shared library implementing the PKCS #11 \
Cryptographic Token Interface (Cryptoki) C API atop of TPM2 devices."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "tpm2-pkcs11-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "69d20abbe442e2476b89fa70e00f55190abe74a7ded06559dbf3f8b4ed756d6c071f62eae9208fa79d66033b500189857b05b2236325a2c673b493eabe801d53"

RPROVIDES:${PN} += "libtpm2_pkcs11-0 libtpm2_pkcs11.so.0()(64bit) pkgconfig(tpm2-pkcs11) python3.10dist(tpm2-pkcs11-tools) python3dist(tpm2-pkcs11-tools) tpm2-pkcs11 tpm2-pkcs11(aarch-64) tpm2-pkcs11-devel"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/pkg-config /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libsqlite3.so.0()(64bit) libtss2-esys.so.0()(64bit) libtss2-fapi.so.1()(64bit) libtss2-mu.so.0()(64bit) libtss2-rc.so.0()(64bit) libtss2-tctildr.so.0()(64bit) libyaml-0.so.2()(64bit) pkgconfig(libcrypto) pkgconfig(sqlite3) pkgconfig(tss2-esys) pkgconfig(tss2-mu) python(abi) python3.10dist(bcrypt) python3.10dist(cryptography) python3.10dist(pyasn1) python3.10dist(pyasn1-modules) python3.10dist(pyyaml) python3.10dist(setuptools) python3.10dist(tpm2-pytss)"

inherit rpm
