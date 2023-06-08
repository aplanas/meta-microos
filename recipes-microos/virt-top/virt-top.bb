SUMMARY = "Utility like top(1) for displaying virtualization stats"
DESCRIPTION = "virt-top is a 'top(1)'-like utility for showing stats of virtualized \
domains.  Many keys and command line options are the same as for \
ordinary 'top'. \
 \
It uses libvirt so it is capable of showing stats across a variety of \
different virtualization systems."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "virt-top-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "7a18f5f69b0e8e9291b4fa502f079ce66fbffb58ef45c1111e2d4a9ad0b3d628da6883063b566685462ec9f211b6e862aa27c8c1f2ae0eb6c3b6a3c14150b344"

RPROVIDES:${PN} += "ocamlfind(virt-top) virt-top virt-top(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libvirt.so.0()(64bit) libvirt.so.0(LIBVIRT_0.0.3)(64bit) libvirt.so.0(LIBVIRT_0.0.5)(64bit) libvirt.so.0(LIBVIRT_0.1.0)(64bit) libvirt.so.0(LIBVIRT_0.1.1)(64bit) libvirt.so.0(LIBVIRT_0.1.4)(64bit) libvirt.so.0(LIBVIRT_0.1.5)(64bit) libvirt.so.0(LIBVIRT_0.1.9)(64bit) libvirt.so.0(LIBVIRT_0.2.0)(64bit) libvirt.so.0(LIBVIRT_0.2.1)(64bit) libvirt.so.0(LIBVIRT_0.2.3)(64bit) libvirt.so.0(LIBVIRT_0.3.0)(64bit) libvirt.so.0(LIBVIRT_0.3.2)(64bit) libvirt.so.0(LIBVIRT_0.3.3)(64bit) libvirt.so.0(LIBVIRT_0.4.0)(64bit) libvirt.so.0(LIBVIRT_0.4.1)(64bit) libvirt.so.0(LIBVIRT_0.4.2)(64bit) libvirt.so.0(LIBVIRT_0.5.0)(64bit) libvirt.so.0(LIBVIRT_0.6.0)(64bit) libvirt.so.0(LIBVIRT_0.7.1)(64bit) libvirt.so.0(LIBVIRT_0.7.7)(64bit) libvirt.so.0(LIBVIRT_0.8.0)(64bit) libvirt.so.0(LIBVIRT_0.9.0)(64bit) libvirt.so.0(LIBVIRT_0.9.10)(64bit) libvirt.so.0(LIBVIRT_0.9.3)(64bit) libvirt.so.0(LIBVIRT_0.9.8)(64bit) libvirt.so.0(LIBVIRT_1.2.7)(64bit) libvirt.so.0(LIBVIRT_1.2.8)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
