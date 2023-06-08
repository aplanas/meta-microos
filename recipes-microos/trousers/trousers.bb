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

RPM_NAME = "trousers-0.3.15-5.6.aarch64.rpm"
RPM_HASH = "fb93b6c1be4126a10a36a71cd215346b580bd5e9af21488b7ed5b64ce6b034e3cb741a2beb9664a9e61b8d2039213121111aac0d6dc6aa8f46f29dd677d6b21b"

RPROVIDES:${PN} += "config(trousers) trousers trousers(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) user(tss)"

inherit rpm
