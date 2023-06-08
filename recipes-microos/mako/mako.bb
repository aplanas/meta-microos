SUMMARY = "A Wayland notification daemon"
DESCRIPTION = "A notification daemon for Wayland. Intended to be used with sway."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "mako-1.7.1-2.3.aarch64.rpm"
RPM_HASH = "0d1222d1baec032fbe6c8637b0453b7ee166df4f394f7ce8290fb18a07a9b801e58c2e61cb24d5de4f65f37b15bd597b103b2b9f9a4c6aeebf74f48abf17366f"

RPROVIDES:${PN} += "mako mako(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_222)(64bit) libsystemd.so.0(LIBSYSTEMD_243)(64bit) libwayland-client.so.0()(64bit) libwayland-cursor.so.0()(64bit)"

inherit rpm
