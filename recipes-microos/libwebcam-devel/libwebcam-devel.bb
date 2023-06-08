SUMMARY = "Development files for libwebcam"
DESCRIPTION = "Libwebcam provides a user-space library for interaction with the uvcvideo \
kernel driver. One could use this library to manipulate settings for one \
or many UVC-type webcams found attached on a single computer. \
 \
This package contains development files for libwebcam."
LICENSE = "LGPL-3.0+"

PV = "0.2.5"

RPM_NAME = "libwebcam-devel-0.2.5-2.12.aarch64.rpm"
RPM_HASH = "999460074242c27b82f10b8f1ba4d7a797d0463f3a8c7a9f37b715f39527e420c296c13c4f09076a29a4a5950485db5b83418a9ffc6ead83106fe758be8832a9"

RPROVIDES:${PN} += "libwebcam-devel libwebcam-devel(aarch-64) pkgconfig(libwebcam)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libwebcam0"

inherit rpm
