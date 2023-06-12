SUMMARY = "Development files for the Secret Service API library"
DESCRIPTION = "libsecret is a library for storing and retrieving passwords and other \
secrets. It communicates with the 'Secret Service' using DBus."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "libsecret-devel-0.20.5-1.7.aarch64.rpm"
RPM_HASH = "0b68d1767bece602cddaae32f2025ef3cbea4bcdd01f383f5ebbbe61d57d2ee04d89f4710f6e84e00ea7780a66db2946eeeb3b9d2c072991af737ec5aba8b48b"

RPROVIDES:${PN} += "libsecret-devel \
libsecret-devel(aarch-64) \
pkgconfig(libsecret-1) \
pkgconfig(libsecret-unstable)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsecret-1-0 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(libgcrypt) \
pkgconfig(libsecret-1) \
typelib-1_0-Secret-1"

inherit rpm
