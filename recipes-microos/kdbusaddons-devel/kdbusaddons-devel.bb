SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdbusaddons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "5859f7e7e81fd421be484dde42c01e9eb0d4653b5c0889d8d0d348be1a6c7e26f32ce86474b75f85acb62df842aa16cf186eb9207f7aed3d5312c3f4a976462a"

RPROVIDES:${PN} += "cmake(KF5DBusAddons) kdbusaddons-devel kdbusaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) extra-cmake-modules libKF5DBusAddons5"

inherit rpm
