SUMMARY = "Typelib files for libosinfo"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "typelib-1_0-Libosinfo-1_0-1.10.0-3.3.aarch64.rpm"
RPM_HASH = "ffa68af35285db1b25058e82c4910864f1332b76652eff2fe5f82e65046f7edcb1248141aafcff45c0c3909d0ce711ca296d89bd5fcaf365ab4373a87c6770ce"

RPROVIDES:${PN} += "typelib(Libosinfo) \
typelib-1_0-Libosinfo-1_0 \
typelib-1_0-Libosinfo-1_0(aarch-64)"
RDEPENDS:${PN} += "libosinfo-1.0.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(libxml2)"

inherit rpm
