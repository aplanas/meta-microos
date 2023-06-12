SUMMARY = "Plugin for Remmina to allow execution of local commands"
DESCRIPTION = "This package provides a plugin for Remmina allowing the execution of \
local commands."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-exec-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "d4f68f26db40d8891684c5af3318f1a3b97049eb4d28868b63e5e32a0ce0f2c555b233bb71724eaa645db1b98c784aef825815bebd328a0977f80f319bfb851d"

RPROVIDES:${PN} += "remmina-plugin-exec \
remmina-plugin-exec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
remmina"

inherit rpm
