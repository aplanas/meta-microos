SUMMARY = "Glib wrapper library for PKCS#11 - Modules"
DESCRIPTION = "GCK is a wrapper based on GLib implementing the PKCS#11 (Cryptoki) \
interface. \
 \
This package contains various PKCS#11 modules, to expose keys and \
certificates from different sources."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "libgck-modules-gnome-keyring-42.1-2.3.aarch64.rpm"
RPM_HASH = "aabe2cf35b7b046dba423dfc6d37b8f652253f262e25a0e43819efc728972e77e9c1dbada97d64e95a5921c45a1da91253327af0afd717ce52d122e9410826ef"

RPROVIDES:${PN} += "libgck-modules-gnome-keyring libgck-modules-gnome-keyring(aarch-64)"
RDEPENDS:${PN} += "gck ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit)"

inherit rpm
