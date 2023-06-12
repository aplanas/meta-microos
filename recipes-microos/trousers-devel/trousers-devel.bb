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

RPM_NAME = "trousers-devel-0.3.15-6.1.aarch64.rpm"
RPM_HASH = "d4f01e50cb6b630b68669a73daf86f1932a0f6b411dbdf4d5e67bdaaf9d6120e6b1a98b3a5d82c3801987c25dcf3d8f69924de9806b6368a420a7d8d35dc9431"

RPROVIDES:${PN} += "trousers-devel trousers-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libopenssl-devel libtspi1 trousers"

inherit rpm
