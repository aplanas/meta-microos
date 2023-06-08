SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend. \
The package is dummy."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-dummy-0.189-2.3.aarch64.rpm"
RPM_HASH = "f34514c44793493dda30fc5d398c23768d237f8b28dce6c79796660c115e3e6732c5c8f5b6f99c857b4612dbf0b04b0d57507a9b0210732c098aeb5e7d0775a1"

RPROVIDES:${PN} += "libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0)(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.183)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdebuginfod1 libdebuginfod1-dummy libdebuginfod1-dummy(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
