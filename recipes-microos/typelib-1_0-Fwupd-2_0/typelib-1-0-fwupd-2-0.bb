SUMMARY = "GObject-introspection bindings for libfwupd"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "typelib-1_0-Fwupd-2_0-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "6ada2771a85392175fccbbb8e0575a759d184c4b785c6172fe177e20531daf204b7eadc9e521bd71970e912544800d2d12e93814ddd08f1acbd83882a4fc22bb"

RPROVIDES:${PN} += "typelib(Fwupd) \
typelib-1_0-Fwupd-2_0 \
typelib-1_0-Fwupd-2_0(aarch-64)"
RDEPENDS:${PN} += "libfwupd.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Json)"

inherit rpm
