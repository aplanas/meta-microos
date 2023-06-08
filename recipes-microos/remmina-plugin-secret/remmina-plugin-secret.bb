SUMMARY = "Gnome Keyring Pasword Manager Plugin for Remmina"
DESCRIPTION = "This package provides a Remmina plugin for the GNOME keyring password manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-secret-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "e0b47425c8a0b2d4df9f14362b517ddcce6dd6b363ae9c6d12962d4d96c4fc74de426db8340b73ab37a8ec0a89765f14967b2fbd12fa63633139a9f60967deec"

RPROVIDES:${PN} += "remmina-plugin-secret remmina-plugin-secret(aarch-64) remmina-plugins-gnome"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libsecret-1.so.0()(64bit) remmina"

inherit rpm
