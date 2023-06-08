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

RPM_NAME = "trousers-devel-0.3.15-5.6.aarch64.rpm"
RPM_HASH = "d9d0b4a471253fa8285c4f5a7f531d46df9e1c3443f45cc297e0e55f8fd78f47caaf50cfbb73921eaac15c8a6fe887bb2dfb83584948ebf00b0aec45cb8d60b0"

RPROVIDES:${PN} += "trousers-devel trousers-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libopenssl-devel libtspi1 trousers"

inherit rpm
