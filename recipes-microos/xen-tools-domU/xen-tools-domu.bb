SUMMARY = "Xen Virtualization: Control tools for domain U"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains tools that allow unprivileged domains to query \
the virtualized environment. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_02"

RPM_NAME = "xen-tools-domU-4.17.1_02-1.1.aarch64.rpm"
RPM_HASH = "86195227aa3670005330a90cb0ba471e8574e9be6ca0904f4379f7a7c20e5e35fb2ab33041d2527756d9a6fb2d0d862255b2a29d05bea86ffb3dc4f173829ae0"

RPROVIDES:${PN} += "config(xen-tools-domU) xen-tools-domU xen-tools-domU(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxenctrl.so.4.17()(64bit) libxenctrl.so.4.17(VERS_4.17.0)(64bit) libxenguest.so.4.17()(64bit) libxenguest.so.4.17(VERS_4.17.0)(64bit) libxenstore.so.4()(64bit) libxenstore.so.4(VERS_4.0)(64bit) xen-libs"

inherit rpm
