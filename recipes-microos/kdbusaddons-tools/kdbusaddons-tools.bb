SUMMARY = "Convenience classes for QtDBus: CLI tools"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Aditional CLI tools."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdbusaddons-tools-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7adbb88ca2e36709580b5f4408ae913df21e88824f90d84920fa0e594d41047747611550a74657b6e2864afa86f88f8f4d8a90c472e3a9064344bab546fb6de4"

RPROVIDES:${PN} += "kdbusaddons-tools kdbusaddons-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
