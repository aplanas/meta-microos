SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-CudaGst-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "6382b7202c0f6fb62e1915afa77bd91176acab71848cac5d093c3571688a0ebe76406ecdfc2f709134ad3bd98b17f447e25cbe6a78a994e3c71fc74a4a62501d"

RPROVIDES:${PN} += "typelib(CudaGst) typelib-1_0-CudaGst-1_0 typelib-1_0-CudaGst-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstcuda-1.0.so.0()(64bit)"

inherit rpm
