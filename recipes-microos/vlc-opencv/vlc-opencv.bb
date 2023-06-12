SUMMARY = "OpenCV plugins for VLC media player"
DESCRIPTION = "This subpackage provides a wrapper plugin for OpenCV for \
OpenCV based video filters and a face detection example."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-opencv-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "69db56c8b4392ff52fe784bbd0b2b51f0725050af47b6e381c4c9c55f7a2d52601a3b6ccc190bb71bff32c546f4d85420da517d331a4b269ff4f911df040e5f4"

RPROVIDES:${PN} += "libopencv_example_plugin.so()(64bit) \
libopencv_wrapper_plugin.so()(64bit) \
vlc-opencv \
vlc-opencv(aarch-64) \
vlc:/usr/lib64/vlc/plugins/video_filter/libopencv_example_plugin.so"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libopencv_core.so.3.4()(64bit) \
libopencv_imgproc.so.3.4()(64bit) \
libopencv_objdetect.so.3.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libvlccore.so.9()(64bit) \
vlc-noX"

inherit rpm
