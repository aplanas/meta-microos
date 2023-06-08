SUMMARY = "Convenience classes for QtDBus: Build Environment"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdbusaddons-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "42f844e8c26ac56f5d2f75bb6afe7d85af6a35f63acfa81d40aff09f44a712dee48acea5437de5265cd8534c1e07ef03b0774ede401d081f5e8a1d468771cfba"

RPROVIDES:${PN} += "cmake(KF5DBusAddons) kdbusaddons-devel kdbusaddons-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5DBus) extra-cmake-modules libKF5DBusAddons5"

inherit rpm
