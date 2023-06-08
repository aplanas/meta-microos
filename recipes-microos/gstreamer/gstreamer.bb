SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "13f7c83fbdfee804d808c5bc963772be66d53c645fd337f8918bf6b72f69bf4889bea57fabba3e16abf39655a425630086d16f650205401d52bdb282a4cec951"

RPROVIDES:${PN} += "gstreamer gstreamer(aarch-64) gstreamer-doc libgstcoreelements.so()(64bit) libgstcoretracers.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstreamer-1_0-0 permissions"

inherit rpm
