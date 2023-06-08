SUMMARY = "GStreamer Transcoder API"
DESCRIPTION = "This subpackage contains the implementation of the GStreamer API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgsttranscoder-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "eedaecb9946994f99c173082e4995c03502815501bb7e4f393561728d88bdd4326db5b3633fe1453c3e67fa83f456b5bd7f90805760f0f1a728c37490f6a3d3c"

RPROVIDES:${PN} += "libgsttranscoder-1.0.so.0()(64bit) libgsttranscoder-1_0-0 libgsttranscoder-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
