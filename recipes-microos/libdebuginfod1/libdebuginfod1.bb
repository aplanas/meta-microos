SUMMARY = "Library for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The libdebuginfod1 package contains shared libraries \
dynamically loaded from -ldw, which use a debuginfod service \
to look up debuginfo and associated data. Also includes a \
command-line frontend."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libdebuginfod1-0.189-2.3.aarch64.rpm"
RPM_HASH = "efbff81afdfe0e8cb91d1420162c44384c78dfc54951a46ef8938cb923ec611e21cb87092365057c425b873b6389d10817be214070240c85ed2fd3493cfc3ab9"

RPROVIDES:${PN} += "libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0)(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.183)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdebuginfod1 libdebuginfod1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit)"

inherit rpm
