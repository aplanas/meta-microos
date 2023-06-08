SUMMARY = "Spell checker library for GTK+"
DESCRIPTION = "gspell provides a flexible API to implement the spell checking in a GTK+ \
application. \
 \
This package provides the shared libraries for gspell."
LICENSE = "LGPL-2.1-or-later"

PV = "1.12.1"

RPM_NAME = "libgspell-1-2-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "8b099c09a1fcbffd6948c68025b64df2406b2d58cdff083dbd285e740a7cd77a9c229ac3f73dc6dbea2b4c8f4badf12d924ab1a8adf12863a5edb450c55fc633"

RPROVIDES:${PN} += "gspell libgspell-1-2 libgspell-1-2(aarch-64) libgspell-1.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libenchant-2.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libicuuc.so.72()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
