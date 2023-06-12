SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdbusaddons-tools-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0fae565ea03c05f120b3f6c268b6fab1edca1286f063354dac39df985be8549dd8b28a99a850bfd5f4dd68ddf5ea4576c3c1a187e9925d54c3ed4fb80202f9b9"

RPROVIDES:${PN} += "kdbusaddons-tools kdbusaddons-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
