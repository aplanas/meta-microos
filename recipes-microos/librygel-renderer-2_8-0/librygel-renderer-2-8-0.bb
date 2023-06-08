SUMMARY = "Render library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the renderer library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.3"

RPM_NAME = "librygel-renderer-2_8-0-0.42.3-1.1.aarch64.rpm"
RPM_HASH = "3a1b428aecfc3869f903cafe4dd78a6d4a6db7e023b5117c3a6cd2ad115e332f70dcbf77d9b309f16a9cce43af86de527ebd7ef96d2fa6ed1846bea172b2bd33"

RPROVIDES:${PN} += "librygel-renderer-2.8.so.0()(64bit) librygel-renderer-2_8-0 librygel-renderer-2_8-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgee-0.8.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgupnp-1.6.so.0()(64bit) libgupnp-av-1.0.so.3()(64bit) librygel-core-2.8.so.0()(64bit) libsoup-3.0.so.0()(64bit)"

inherit rpm
