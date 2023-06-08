SUMMARY = "OpenSSL TPM 2.0 interface engine plugin"
DESCRIPTION = "This package contains a plugin a for OpenSSL which connects it with the \
Trusted Platform Module version 2.0 found on newer machines and a \
create_tpm2_key helper binary to create and extract a TPM key."
LICENSE = "LGPL-2.1-only"

PV = "4.0.0"

RPM_NAME = "openssl_tpm2_engine-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "af13766fab41af9bf18cb3f4b086f3a2563e356dc3d034d680783b9a1a846eaa3dd179dd8b6e56ea7a6735fdd67b2147c2ffe7f72ee83cec953a8b462211300e"

RPROVIDES:${PN} += "libtpm2.so()(64bit) openssl_tpm2_engine openssl_tpm2_engine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libibmtss.so.1()(64bit)"

inherit rpm
