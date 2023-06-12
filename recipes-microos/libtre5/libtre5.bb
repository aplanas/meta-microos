SUMMARY = "POSIX compatible regexp library with approximate matching"
DESCRIPTION = "TRE is a lightweight, robust, and efficient POSIX compatible regexp \
matching library with some exciting features such as approximate \
matching."
LICENSE = "BSD-3-Clause"

PV = "0.8.0_git201402282055"

RPM_NAME = "libtre5-0.8.0_git201402282055-7.2.aarch64.rpm"
RPM_HASH = "dba3f6b7b24033a82b307e92f335174e1ceb02710c5139fee9b5e9a0914e383fae1904758bb3b336b124100b1971ca8472a40909a5788170cae030f633843066"

RPROVIDES:${PN} += "libtre \
libtre.so.5()(64bit) \
libtre5 \
libtre5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
tre"

inherit rpm
