SUMMARY = "OpenSSL Engine for TPM2 devices"
DESCRIPTION = "The tpm2-tss-engine project implements a cryptographic engine for OpenSSL for \
Trusted Platform Module (TPM 2.0) using the tpm2-tss software stack that follows \
the Trusted Computing Groups (TCG) TPM Software Stack (TSS 2.0). It uses the \
Enhanced System API (ESAPI) interface of the TSS 2.0 for downwards communication. \
It supports RSA decryption and signatures as well as ECDSA signatures."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "c5ab52efe812ccf6599d8216b50ab0f63902d95eeef0160331b611e7660fb5ecf7970117f0a90590eb2c4084e44b9e56d1539cda4bc4a8c0a5fe611be01bbb9c"

RPROVIDES:${PN} += "libtpm2tss.so()(64bit) tpm2-tss-engine tpm2-tss-engine(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libtss2-esys.so.0()(64bit) libtss2-mu.so.0()(64bit) libtss2-tctildr.so.0()(64bit)"

inherit rpm
