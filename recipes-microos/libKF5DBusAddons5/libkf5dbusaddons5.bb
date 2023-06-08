SUMMARY = "Convenience classes for QtDBus"
DESCRIPTION = "KDBusAddons provides convenience classes on top of QtDBus, as well as an API to \
create KDED modules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5DBusAddons5-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "e30bf0d207c6fa6b7be109164da7254471f30275b12c54ca40de584dd5ea8796fe25fe421a5da4036637b837b45f6a5a1e7784c65042b37a94488430346ccb6b"

RPROVIDES:${PN} += "libKF5DBusAddons.so.5()(64bit) libKF5DBusAddons5 libKF5DBusAddons5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5DBus5 libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
