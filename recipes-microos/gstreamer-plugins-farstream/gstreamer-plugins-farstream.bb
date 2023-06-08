SUMMARY = "GStreamer Plug-Ins for videoconferencing"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "gstreamer-plugins-farstream-0.2.9+5-2.3.aarch64.rpm"
RPM_HASH = "e99400300d46ecc250657c47ce982873d6664d962c98cdf624d86cdebf1b96851bc2c15ede98735e9d6bae4abcc3079a3eec56adcb0b4474291ca8d22c1a2294"

RPROVIDES:${PN} += "gstreamer-plugins-farstream gstreamer-plugins-farstream(aarch-64) libfsrawconference.so()(64bit) libfsrtpconference.so()(64bit) libfsrtpxdata.so()(64bit) libfsvideoanyrate.so()(64bit)"
RDEPENDS:${PN} += "gstreamer-plugins-bad gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libfarstream-0.2.so.5()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
