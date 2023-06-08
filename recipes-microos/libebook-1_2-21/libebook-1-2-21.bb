SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libebook-1_2-21-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "d5cd76af32163593ce7e0c05ccd23b89c113eb614141dfbbca5fbe7edec27d947e7ec6d262a317788255a25b2a5705eea063f462d90009fd8854def7c60bb9db"

RPROVIDES:${PN} += "libebook-1.2.so.21()(64bit) libebook-1_2-21 libebook-1_2-21(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libebook-contacts-1.2.so.4()(64bit) libedata-book-1.2.so.27()(64bit) libedataserver-1.2.so.27()(64bit) libedbus-private.so()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
