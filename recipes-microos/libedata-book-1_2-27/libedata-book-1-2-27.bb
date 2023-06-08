SUMMARY = "Evolution Data Server's Address Book Backend Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for address book backends."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libedata-book-1_2-27-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "90b603af488d9951e11940083cc6aeabe5667b216d2a85f8fcfa12f8595821d0163d3b6e135c67dd727bebf40b74db802a41470c9e51dafa3d38e7e779313012"

RPROVIDES:${PN} += "libedata-book-1.2.so.27()(64bit) libedata-book-1_2-27 libedata-book-1_2-27(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libebackend-1.2.so.11()(64bit) libebook-contacts-1.2.so.4()(64bit) libedataserver-1.2.so.27()(64bit) libedbus-private.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libsoup-3.0.so.0()(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
