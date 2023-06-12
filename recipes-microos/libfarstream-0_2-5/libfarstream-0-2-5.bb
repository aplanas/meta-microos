SUMMARY = "GStreamer modules and libraries for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "libfarstream-0_2-5-0.2.9+5-2.3.aarch64.rpm"
RPM_HASH = "1393e0366d329fcb5750ec6417104dc859d07916177b9d85421dbd53fbb8a541e2e6df8e9aae5fb0b8cc398f660344851d2c39bc9d9c096f91fff1fd9a215df0"

RPROVIDES:${PN} += "libfarstream-0.2.so.5()(64bit) \
libfarstream-0_2-5 \
libfarstream-0_2-5(aarch-64) \
libmulticast-transmitter.so()(64bit) \
libnice-transmitter.so()(64bit) \
librawudp-transmitter.so()(64bit) \
libshm-transmitter.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
farstream-data \
gstreamer-plugins-farstream \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstnet-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libnice.so.10()(64bit)"

inherit rpm
