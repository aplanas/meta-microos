SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libavahi-ui-gtk3-0-0.8-23.1.aarch64.rpm"
RPM_HASH = "e387695b35c80a9ad4daf61c1d738a97defa76fca9d917b492ac56cb3601b319f45c463ae184274fa1eab9c857e12d1404d1d4b6b185f0f41b0f3208d43a6c52"

RPROVIDES:${PN} += "libavahi-ui-gtk3-0 libavahi-ui-gtk3-0(aarch-64) libavahi-ui-gtk3.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libavahi-glib.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdbm.so.6()(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
