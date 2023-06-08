SUMMARY = "Python interface for libkdumpfile"
DESCRIPTION = " \
 \
 \
 \
 \
This package contains all necessary python modules to use libkdumpfile via \
the Python interpreter."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-or-later"

PV = "0.5.1+git3.g97c716a"

RPM_NAME = "python311-libkdumpfile-0.5.1+git3.g97c716a-3.1.aarch64.rpm"
RPM_HASH = "46502d0307e1a750bb5ace545ab173ea903be10d463242f5174ae6330332fc4a37af6269f9a86aa4f99e7cfdc1085771577b1f577fdeeaa81559427f0ab369de"

RPROVIDES:${PN} += "python3.11dist(libkdumpfile) python311-libkdumpfile python311-libkdumpfile(aarch-64) python3dist(libkdumpfile)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaddrxlat.so.3()(64bit) libaddrxlat.so.3(LIBADDRXLAT_0)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkdumpfile.so.10()(64bit) libkdumpfile.so.10(LIBKDUMPFILE_0)(64bit) python(abi)"

inherit rpm
