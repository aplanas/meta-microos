SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Development files for the Vala runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.8"

RPM_NAME = "libvala-0_56-devel-0.56.8-1.1.aarch64.rpm"
RPM_HASH = "2590492bee2898ae6fde3345b3ce5d2aa91cd50d4c5d6ad06fff47345479b24bd6b155d69db1537157ddf4a4c7850ff621f4883e741df48b98a89913dabb4bc9"

RPROVIDES:${PN} += "libvala-0_56-devel \
libvala-0_56-devel(aarch-64) \
libvala-devel \
pkgconfig(libvala-0.56)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvala-0_56-0 \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
