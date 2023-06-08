SUMMARY = "Remote User Interface handling library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the ruih library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-ruih-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "e52514daaf8d0463689e26bf7f61458f36e915d5b31041857f9ac622be5afb53a82455aa096b3b195014e219fa59c2a76fb5f41303fd1ac1f5fb81f9192201ae"

RPROVIDES:${PN} += "librygel-ruih-2.8.so.0()(64bit) librygel-ruih-2_8-0 librygel-ruih-2_8-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgupnp-1.6.so.0()(64bit) librygel-core-2.8.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
