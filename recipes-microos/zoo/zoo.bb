SUMMARY = "Pack Program"
DESCRIPTION = "Zoo is a packer based on the Lempel-Ziv algorithm. Lots of files on \
DOS/AmigaDOS and TOS systems used this packer for their archives. The \
compression rate of gzip is not reached, and thus zoo should only be used \
for decompressing old archives."
LICENSE = "SUSE-Public-Domain"

PV = "2.10"

RPM_NAME = "zoo-2.10-1027.12.aarch64.rpm"
RPM_HASH = "b3cd17aa842c35f2de7eff8a624adf37cc3ba2b50293f4976ce5a29ff79c6102aacf6f014217c5496868f621352db7d9826561ae6e6c61c906fefd10cb068c4b"

RPROVIDES:${PN} += "zoo \
zoo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
