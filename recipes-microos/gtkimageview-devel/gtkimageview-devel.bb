SUMMARY = "Development files for gtkimageview"
DESCRIPTION = "GtkImageView is a widget that provides a zoomable and panable view of a \
GdkPixbuf. It is intended to be usable in most types of image viewing \
applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.6.4"

RPM_NAME = "gtkimageview-devel-1.6.4-22.21.aarch64.rpm"
RPM_HASH = "9b56870751bf1e6040a7abb01fd1ce30b945aa82bbfe69fbc95fca3cc893fc87433bb2f3b520c8c6888e22996960c08fb9c17ad59549084dedbc25e7d874d662"

RPROVIDES:${PN} += "gtkimageview-devel \
gtkimageview-devel(aarch-64) \
libgtkimageview-devel \
pkgconfig(gtkimageview)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-devel \
libgtkimageview0 \
pkgconfig(gtk+-2.0)"

inherit rpm
