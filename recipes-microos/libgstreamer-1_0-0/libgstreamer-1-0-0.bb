SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstreamer-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "09608407cf1f18c55f7ff216d00bc58e75c73b413c5b70cd6a181c73ea4cc7b6be6402b1fb01603a46f1ffa9b2d54d569f46f9240a9b1d999a5c59d834f58a01"

RPROVIDES:${PN} += "libgstbase-1.0.so.0()(64bit) libgstcheck-1.0.so.0()(64bit) libgstcontroller-1.0.so.0()(64bit) libgstnet-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstreamer-1_0-0 libgstreamer-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libunwind.so.8()(64bit)"

inherit rpm
