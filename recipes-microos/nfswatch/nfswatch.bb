SUMMARY = "An NFS traffic monitoring tool"
DESCRIPTION = "Nfswatch is a command-line tool for monitoring NFS traffic. \
Nfswatch can capture and analyze the NFS packets on a particular \
network interface or on all interfaces."
LICENSE = "BSD-2-Clause"

PV = "4.99.11"

RPM_NAME = "nfswatch-4.99.11-2.16.aarch64.rpm"
RPM_HASH = "eb0e4ff769e2c52da9a130f5e4af06232f27bb5a077d4e807a2a4122977c4c9464fb213692d44e4dff48b0ee7a58e9943e1736c97f4dd59764e2097e2674a62f"

RPROVIDES:${PN} += "nfswatch \
nfswatch(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpcap.so.1()(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.0)(64bit)"

inherit rpm
