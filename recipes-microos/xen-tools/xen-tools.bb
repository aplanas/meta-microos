SUMMARY = "Xen Virtualization: Control tools for domain 0"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the control tools that allow you to start, stop, \
migrate, and manage virtual machines. \
 \
In addition to this package you need to install xen and xen-libs \
to use Xen. \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_02"

RPM_NAME = "xen-tools-4.17.1_02-1.1.aarch64.rpm"
RPM_HASH = "1b9726166e484134c4670d9feb5d96341be7b7d70fa6f35819633a668ad4747785b4a22e73989bbae7093a423fd5e1ccbf7d5594ed315e4391c187e5f7c57e13"

RPROVIDES:${PN} += "config(xen-tools) xen-tools xen-tools(aarch-64) xen-tools-ioemu"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libncurses.so.6()(64bit) libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libxencall.so.1()(64bit) libxencall.so.1(VERS_1.2)(64bit) libxenctrl.so.4.17()(64bit) libxenctrl.so.4.17(VERS_4.17.0)(64bit) libxenevtchn.so.1()(64bit) libxenevtchn.so.1(VERS_1.0)(64bit) libxenevtchn.so.1(VERS_1.2)(64bit) libxenforeignmemory.so.1()(64bit) libxenforeignmemory.so.1(VERS_1.0)(64bit) libxenforeignmemory.so.1(VERS_1.3)(64bit) libxenforeignmemory.so.1(VERS_1.4)(64bit) libxenfsimage.so.4.17()(64bit) libxenfsimage.so.4.17(libfsimage.so.1.0)(64bit) libxengnttab.so.1()(64bit) libxengnttab.so.1(VERS_1.0)(64bit) libxengnttab.so.1(VERS_1.1)(64bit) libxengnttab.so.1(VERS_1.2)(64bit) libxenguest.so.4.17()(64bit) libxenguest.so.4.17(VERS_4.17.0)(64bit) libxenhypfs.so.1()(64bit) libxenhypfs.so.1(VERS_1.0)(64bit) libxenlight.so.4.17()(64bit) libxenlight.so.4.17(VERS_4.17.0)(64bit) libxenstat.so.4.17()(64bit) libxenstat.so.4.17(VERS_4.17.0)(64bit) libxenstore.so.4()(64bit) libxenstore.so.4(VERS_4.0)(64bit) libxentoollog.so.1()(64bit) libxentoollog.so.1(VERS_1.0)(64bit) libxenvchan.so.4.17()(64bit) libxenvchan.so.4.17(VERS_4.17.0)(64bit) libxlutil.so.4.17()(64bit) libxlutil.so.4.17(VERS_4.17.0)(64bit) libyajl.so.2()(64bit) python(abi) python3 python3-curses qemu-arm xen xen-libs"

inherit rpm
