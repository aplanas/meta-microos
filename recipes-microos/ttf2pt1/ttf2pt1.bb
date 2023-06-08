SUMMARY = "True Type Font to PostScript Type 1 font converter"
DESCRIPTION = "This is a collection of tools and scripts that allow to convert True \
Type Fonts (as used by MS Wind*ws) to be converted to Postscript Type 1 \
fonts, so they can be used in X11 and Ghostscript."
LICENSE = "BSD-3-Clause"

PV = "3.4.4"

RPM_NAME = "ttf2pt1-3.4.4-1.22.aarch64.rpm"
RPM_HASH = "0feb2b3e10199910297f0d922d0f4d6b841efc6466c785d9f485009ed8fdca806447f801a2d21267dc6e96821a6b45643c9886e430bdf8e8e377f103614c78b2"

RPROVIDES:${PN} += "config(ttf2pt1) ttf2pt1 ttf2pt1(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) t1utils"

inherit rpm
