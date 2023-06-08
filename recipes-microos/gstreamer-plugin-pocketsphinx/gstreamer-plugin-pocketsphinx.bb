SUMMARY = "GStreamer Plugin for pocketsphinx"
DESCRIPTION = "Pocketsphinx is a version of the open-source CMU Sphinx II speech \
recognition system which is able to recognize speech in real-time. \
 \
This package provides the GStreamer plugin for pocketsphinx."
LICENSE = "BSD-2-Clause"

PV = "5~git20200227.e40da77"

RPM_NAME = "gstreamer-plugin-pocketsphinx-5~git20200227.e40da77-2.3.aarch64.rpm"
RPM_HASH = "83ef7757ab7a88fd3fc07d1e7a5ee28bb773fa1463985e24df89bbdf90dfd4afb5006508dd637273cf6562eaf80952c446cbc9d82f77b80239369135723066cc"

RPROVIDES:${PN} += "gstreamer-plugin-pocketsphinx gstreamer-plugin-pocketsphinx(aarch-64) gstreamer1(element-pocketsphinx)()(64bit) libgstpocketsphinx.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libpocketsphinx.so.3()(64bit) libsphinxbase.so.3()(64bit) pocketsphinx5"

inherit rpm
