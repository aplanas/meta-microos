SUMMARY = "Development files for tpm2-pkcs11"
DESCRIPTION = "Headers and libraries to build software against tpm2-pkcs11."
LICENSE = "BSD-2-Clause"

PV = "1.9.0"

RPM_NAME = "tpm2-pkcs11-devel-1.9.0-1.3.aarch64.rpm"
RPM_HASH = "76f52fdbbeeb989a93c722000cae951d4b0f8be97f43f781c700658763daf2518c9375edd96a134c414fa03af39a8fe6d006847192d2febca92a8bd88fa2684c"

RPROVIDES:${PN} += "libtpm2_pkcs11-devel pkgconfig(tpm2-pkcs11) tpm2-pkcs11-devel tpm2-pkcs11-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libtpm2_pkcs11-0 pkgconfig(libcrypto) pkgconfig(sqlite3) pkgconfig(tss2-esys) pkgconfig(tss2-mu)"

inherit rpm
