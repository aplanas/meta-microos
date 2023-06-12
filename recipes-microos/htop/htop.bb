SUMMARY = "An Interactive text-mode Process Viewer for Linux"
DESCRIPTION = "htop is an interactive text-mode process viewer for Linux. It aims to be a \
better 'top' and requires ncurses."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.2"

RPM_NAME = "htop-3.2.2-1.3.aarch64.rpm"
RPM_HASH = "e0db5061446be8c6a046c578b1ce9034888b6940f18c184606a6ea2cfe00d4662e99b02db08ce97386396d9bb053e02ff1a67952f023d1ba62806c7e277300df"

RPROVIDES:${PN} += "application() \
application(htop.desktop) \
htop \
htop(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
