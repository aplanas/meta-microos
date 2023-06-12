SUMMARY = "Real-Time Interface Bandwidth Usage"
DESCRIPTION = "iftop does for network usage what top(1) does for CPU usage. It listens \
to network traffic on a named interface and displays a table of current \
bandwidth usage by pairs of hosts. It is handy for explaining why the \
network links slow."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.4"

RPM_NAME = "iftop-0.99.4-9.8.aarch64.rpm"
RPM_HASH = "6e2198cbdb41e383ca4bd36cb05638e0de0f06477211208f5d30be342a08a50a1ea14b4137254ed0b345f8320a91f0d4d78a5d784691a17fc92041dc1458d93e"

RPROVIDES:${PN} += "iftop \
iftop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpcap.so.1()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
