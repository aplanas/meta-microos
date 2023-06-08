SUMMARY = "Development files for the Xorg X server Wacom input driver"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-devel-0.40.0-2.7.aarch64.rpm"
RPM_HASH = "9a052c458c8db115c7e1598494c03a7c88430d1ba6ad682d4c4d2b8a83ed4cefbab81b3e7710fe4454f336beed2acc1f847577d7835c2a4d5c1f88713dc771e1"

RPROVIDES:${PN} += "pkgconfig(xorg-wacom) x11-input-wacom-devel xf86-input-wacom-devel xf86-input-wacom-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) xf86-input-wacom"

inherit rpm
