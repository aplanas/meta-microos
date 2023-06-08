SUMMARY = "Library to read and write ELF files"
DESCRIPTION = "This package provides a high-level library to read and write ELF files. \
This is part of the elfutils package."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "libelf1-0.189-2.3.aarch64.rpm"
RPM_HASH = "a25d5ff162f05dbd29a8cc07ef1bdffed56768efb886f575e3cd8c3ad063249d8f18bf3ef9273e345860e536301850b3f4489caf2629d60a718f3aa9ad0cb0a2"

RPROVIDES:${PN} += "libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.1)(64bit) libelf.so.1(ELFUTILS_1.1.1)(64bit) libelf.so.1(ELFUTILS_1.2)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit) libelf.so.1(ELFUTILS_1.4)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libelf.so.1(ELFUTILS_1.6)(64bit) libelf.so.1(ELFUTILS_1.7)(64bit) libelf1 libelf1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
