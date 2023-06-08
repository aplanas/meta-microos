SUMMARY = "GNUstep Base library package"
DESCRIPTION = "The GNUstep Base Library is a library of general-purpose, \
non-graphical Objective C classes, inspired by the \
OpenStep API but implementing Apple and GNU additions to the API \
as well."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.29.0"

RPM_NAME = "gnustep-base-1.29.0-1.4.aarch64.rpm"
RPM_HASH = "15eb01423ef1ca6319aba345d6d783dd69c27427153510f10b73dbe47e07ce3d35c32bf3cb1fc6fc546307f0b57bd0d3a0cb031b5e9e4b8302149c2fbb7f3e37"

RPROVIDES:${PN} += "config(gnustep-base) gnustep-base gnustep-base(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnustep-make ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgnustep-base.so.1.29()(64bit) libobjc.so.4()(64bit)"

inherit rpm
