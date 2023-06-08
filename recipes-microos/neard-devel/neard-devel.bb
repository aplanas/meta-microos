SUMMARY = "Files needed for NFC development"
DESCRIPTION = "Files needed to develop applications for the NFC stack."
LICENSE = "GPL-2.0-only"

PV = "0.18"

RPM_NAME = "neard-devel-0.18-1.3.aarch64.rpm"
RPM_HASH = "e95c758700692b4524e86e18a100b813dce52bb2158213b0e2d7f54775569f39874c01a982e65f5bc06c705be8e6f7f9d608f4fda5f4ff17c60c926a0c2f3848"

RPROVIDES:${PN} += "neard-devel neard-devel(aarch-64) pkgconfig(neard)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(dbus-1) pkgconfig(glib-2.0) pkgconfig(libnl-3.0) pkgconfig(libnl-genl-3.0)"

inherit rpm
