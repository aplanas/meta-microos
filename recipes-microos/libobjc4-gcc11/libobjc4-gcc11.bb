SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libobjc4-gcc11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "b0dbf404787ff459c7d128e9937db96f76dd8efd284ed05a44f1fa4930c9e831c944edb7709d5f1d00379b5d1feab7d6c03b7a46a06fe5e4cea21bbceac66cb5"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) libobjc4 libobjc4-gcc11 libobjc4-gcc11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
