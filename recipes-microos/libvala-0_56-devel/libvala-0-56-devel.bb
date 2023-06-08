SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.7"

RPM_NAME = "libvala-0_56-devel-0.56.7-1.1.aarch64.rpm"
RPM_HASH = "ac312547815a0804dad531e95948c306e08c242daa4cf2f3cb65a9d2bd9694381506a60f2ec69112ce4d6cdf1b22c0fbaac5e954acbc600e688a273491b1b9dc"

RPROVIDES:${PN} += "libvala-0_56-devel libvala-0_56-devel(aarch-64) libvala-devel pkgconfig(libvala-0.56)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvala-0_56-0 pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0)"

inherit rpm
