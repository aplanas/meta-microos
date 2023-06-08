SUMMARY = "USB interface library for J-Link"
DESCRIPTION = "Library for accessing Segger J-Link USB devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "libjaylink-0.3.1-1.2.aarch64.rpm"
RPM_HASH = "7f43cb68ddfe215fcaba8f1c637bdec11f6e37730c3bfdfeaac1a586a0b221abb66ed610aafbdb0e9abd64725096ca61baaed7fa8a01bbb07220fc7ae3c22bd1"

RPROVIDES:${PN} += "libjaylink libjaylink(aarch-64) libjaylink0:/usr/lib/udev/rules.d/99-libjaylink.rules"
RDEPENDS:${PN} += "/bin/sh udev"

inherit rpm
