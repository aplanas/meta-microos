SUMMARY = "Development for libcamera, a camera support library"
DESCRIPTION = "libcamera is an experimental camera user-space API. \
 \
This subpackage contains the header files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.0.4"

RPM_NAME = "libcamera-devel-0.0.4-2.3.aarch64.rpm"
RPM_HASH = "6ece461c6dd722873294c4b72b3ba6f452f86821f8f59712470ce72b97e5293dd5863ca22e55a8b89c3f83301f0cc810411b01caee590238ec899d95114b4087"

RPROVIDES:${PN} += "libcamera-devel \
libcamera-devel(aarch-64) \
pkgconfig(libcamera) \
pkgconfig(libcamera-base)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcamera-base0_0_4 \
libcamera0_0_4 \
pkgconfig(libcamera-base)"

inherit rpm
