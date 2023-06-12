SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-dummy-0.189-3.1.aarch64.rpm"
RPM_HASH = "962f4f677cb5300a384b60b05bbc14a9eef163cc11b363e058b56fc56c3a5cfd386f7b1baecb200e97fb85ca48103e5b2ca261cd059ae333fd508cda48b7fc12"

RPROVIDES:${PN} += "libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0)(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.183)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdebuginfod1 libdebuginfod1-dummy libdebuginfod1-dummy(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
