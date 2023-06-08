SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "433d6e6750422cebd7146e7a1b56e01a0f8fa14b25908bfec003314ff498407c30ccde9026fb2772c2f425df7beda54ac245d9f6418d06fef23b24fad0b36c4d"

RPROVIDES:${PN} += "typelib(CudaGst) typelib-1_0-CudaGst-1_0 typelib-1_0-CudaGst-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstcuda-1.0.so.0()(64bit)"

inherit rpm
