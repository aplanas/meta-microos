SUMMARY = "GTK+ 3 development files for libcanberra"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the development files for libcanberra-gtk3."
LICENSE = "LGPL-2.0-or-later"

PV = "0.30"

RPM_NAME = "libcanberra-gtk3-devel-0.30-15.23.aarch64.rpm"
RPM_HASH = "e4719516301b9791674551569ca2aee4cd857515dd63dad921f96789ded8533141f4de1aa48e11bbdb2cecaaa05474120c58049a04876eca6c8776a479c7963b"

RPROVIDES:${PN} += "libcanberra-gtk3-devel libcanberra-gtk3-devel(aarch-64) pkgconfig(libcanberra-gtk3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcanberra-devel libcanberra-gtk3-0 libcanberra0 pkgconfig(gdk-3.0) pkgconfig(gtk+-3.0) pkgconfig(libcanberra)"

inherit rpm
