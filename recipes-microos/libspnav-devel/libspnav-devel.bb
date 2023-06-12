SUMMARY = "Include files for libspnav"
DESCRIPTION = "The libspnav library is provided as a replacement of the magellan library. \
It provides a cleaner, and more orthogonal interface. libspnav supports \
both the original X11 protocol for communicating with the driver, and the \
new alternative non-X protocol. Programs that choose to use the X11 \
protocol, are automatically compatible with either the free spacenavd \
driver or the official 3dxserv, as if they were using the magellan SDK. \
 \
Also, libspnav provides a magellan API wrapper on top of the new API. So, \
any applications that were using the magellan library, can switch to \
libspnav without any changes. And programmers that are familliar with the \
magellan API can continue using it with a free library without the \
restrictions of the official SDK."
LICENSE = "BSD-3-Clause"

PV = "1.1"

RPM_NAME = "libspnav-devel-1.1-1.2.aarch64.rpm"
RPM_HASH = "9d877a8cfa9d5aff74a23d3fcb7b018efb76473f32ef223e5a1b37b9420ecfde42f991712c7fb54c07c6cbc328a7ef2bd34700348f3288148aac22d57b86d6f3"

RPROVIDES:${PN} += "libspnav-devel \
libspnav-devel(aarch-64) \
pkgconfig(spnav)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspnav0"

inherit rpm
