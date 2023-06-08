SUMMARY = "Daemon for PGP prompting by libcryptui"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "seahorse-daemon-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "729dce2b13a04ee83af0433d50eb7493699eb917822f5d0787b96350da7b7138d8de1b1aeb9bf9e367f79abaafb9af2eb38942e15e9fba4ef89ddaa4b2dceef6"

RPROVIDES:${PN} += "seahorse-daemon seahorse-daemon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcryptui-data libcryptui.so.0()(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libdbus-glib-1.so.2()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnome-keyring.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgtk-3.so.0()(64bit) libnotify.so.4()(64bit)"

inherit rpm
