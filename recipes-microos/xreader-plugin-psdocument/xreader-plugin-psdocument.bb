SUMMARY = "PostScript document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read PostScript documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-psdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "6d6164ed81f25be9c980a8be932ac586bb58fc0572531a77196819c9322f4d0bd2bec3ae2647ffcbbe85dd25f4a251055227410d783dc09523f41293d18d8995"

RPROVIDES:${PN} += "libpsdocument.so()(64bit) xreader-plugin-psdocument xreader-plugin-psdocument(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libspectre.so.1()(64bit) libxreaderdocument.so.3()(64bit) xreader"

inherit rpm
