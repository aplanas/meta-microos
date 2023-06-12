SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.34.5"

RPM_NAME = "gnome-bluetooth-1-devel-3.34.5-2.7.aarch64.rpm"
RPM_HASH = "fb9c1eae0d05dced45f48441438cbe473a10872190fac58332989e1086e92333fa7d5f749854c4b97fc2f58dc9ff10ec69165f9c28a915a0ef37b30db2ae880a"

RPROVIDES:${PN} += "gnome-bluetooth-1-devel \
gnome-bluetooth-1-devel(aarch-64) \
pkgconfig(gnome-bluetooth-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-bluetooth-1 \
libgnome-bluetooth13 \
pkgconfig(gio-2.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-GnomeBluetooth-1_0"

inherit rpm
