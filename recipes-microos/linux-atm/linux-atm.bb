SUMMARY = "Tools for ATM"
DESCRIPTION = "Tools to support ATM (Asynchronous Transfer Mode) networking."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.5.2"

RPM_NAME = "linux-atm-2.5.2-8.8.aarch64.rpm"
RPM_HASH = "62d0a01f23e6cf3483422a8e196621ac357b37a56c8b52332a003974429f6e94f174d4b2e236fa4fe14893ed21d3c5d3fa2f528404cde6a1ca018de76dc9df3a"

RPROVIDES:${PN} += "config(linux-atm) \
firmware(pca200e.bin) \
firmware(pca200e_ecd.bin2) \
firmware(sba200e_ecd.bin2) \
linux-atm \
linux-atm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfl.so.2()(64bit)"

inherit rpm
