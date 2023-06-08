SUMMARY = "A mission control plugin for Telepathy"
DESCRIPTION = "A mission control plugin for Telepathy, integrating with libaccounts and libsignon \
to provide IM accounts and authentication. This code is based on Nemo Mobile's \
fork of the plugin from Empathy's ubuntu-online-account support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1"

RPM_NAME = "telepathy-accounts-signon-2.1-1.15.aarch64.rpm"
RPM_HASH = "6db3a721fc403cb7ac6656c385f6524b365a4145c4add39be1c846e48e73d48dfe8a784b7361c7325a97aa27021637b96f0ff73e8a6540039bf6e0f1266a18fd"

RPROVIDES:${PN} += "telepathy-accounts-signon telepathy-accounts-signon(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaccounts-glib.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmission-control-plugins.so.0()(64bit) libsignon-glib.so.2()(64bit) libtelepathy-glib.so.0()(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.0)(64bit) libtelepathy-glib.so.0(TELEPATHY_GLIB_0.7.29)(64bit)"

inherit rpm
