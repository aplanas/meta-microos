SUMMARY = "TSS (TCG Software Stack) access daemon for a TPM chip"
DESCRIPTION = "The trousers package provides a TSS implementation through the help of \
a user-space daemon, the tcsd, and a library  Trousers aims to be \
compliant to the 1.1b and 1.2 TSS specifications as available from the \
Trusted Computing website https://www.trustedcomputinggroup.org/. \
 \
The package needs the /dev/tpm device file to be present on your \
system. It is a character device file major 10 minor 224, 0600 tss:tss."
LICENSE = "BSD-3-Clause"

PV = "0.3.15"

RPM_NAME = "libtspi1-0.3.15-5.6.aarch64.rpm"
RPM_HASH = "19f2a33c0e3dc09aa921cb70cd0f61e62ea294e1cd1207884fcc70b4d092b482402328c955403d73718461172191c6e29b3f6e0590502e7d77c4c5ca6dbc8b99"

RPROVIDES:${PN} += "libtspi.so.1()(64bit) libtspi1 libtspi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) trousers"

inherit rpm
