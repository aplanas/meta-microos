SUMMARY = "Utilities for Displaying and Converting Metafile Images"
DESCRIPTION = "These utilities read metafile images and can either display them \
using the X Window System or convert them to standard formats such as \
PNG, JPEG, PS, EPS, and more."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libwmf-tools-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "f2b3af3e89320fd003383097500f5058f0161e67d0674b97640b59d8d8abd4295d2fa28f8326e9d9e09d2f0534614cfcf0d9105f583df1447dffb0230b2837dc"

RPROVIDES:${PN} += "libwmf libwmf-tools libwmf-tools(aarch-64) wmf-utils"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libwmf-0.2.so.7()(64bit) libwmflite-0.2.so.7()(64bit) libz.so.1()(64bit)"

inherit rpm
