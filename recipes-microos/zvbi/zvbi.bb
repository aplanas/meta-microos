SUMMARY = "Linux 'VBI proxy'"
DESCRIPTION = "With 'video4linux' drivers, only one application at a time can capture \
VB data.  The 2nd generation 'v4l2' API allows multiple clients to \
open a device, but still only one client may read from the device.  If, \
for example, the Nxtvepg daemon runs in the background, users will not be \
able to start a Teletext application.  The VBI proxy was developed as a \
solution to this problem."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "zvbi-0.2.41-2.1.aarch64.rpm"
RPM_HASH = "77899c069d5396791b46b8e713bdf2dbfa020334c5cbc30e8751aa8ee55a4e78a87b175c9e8c1b1aff9080aa0ee2173b63e6c4fabfe228441c79906236ec9ed4"

RPROVIDES:${PN} += "zvbi zvbi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libzvbi.so.0()(64bit)"

inherit rpm
