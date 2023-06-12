SUMMARY = "TCTI swtpm interface library"
DESCRIPTION = "A TCTI for interaction with the TPM2 software simulator. It abstracts the \
details of direct communication with the interface and protocol exposed by the \
daemon hosting the TPM2 reference implementation."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "libtss2-tcti-swtpm0-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "a7f2a753d78276b179f75f0fa8de0ef2b1648b78dfd6ab341cc7c22ba011b524d1ea698e37c69b534dac4af1cb4c208585319766986455cf9a91a9a60575adc0"

RPROVIDES:${PN} += "libtss2-tcti-swtpm.so.0()(64bit) \
libtss2-tcti-swtpm0 \
libtss2-tcti-swtpm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libtss2-mu.so.0()(64bit)"

inherit rpm
