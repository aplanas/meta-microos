SUMMARY = "Python 3 bindings for apps which use OpenCV"
DESCRIPTION = "This package contains Python 3 bindings for the OpenCV library."
LICENSE = "BSD-3-Clause"

PV = "3.4.18"

RPM_NAME = "python3-opencv3-3.4.18-2.5.aarch64.rpm"
RPM_HASH = "9af64cd57ee78cb360d69e6fac8b5400ddd9e65beee8e47afec63a36a5f7057b675a667ba69a6c80fef9fbf042ecfef648027d93c84dee3e295dec494fb4f868"

RPROVIDES:${PN} += "python3-opencv-qt5 python3-opencv3 python3-opencv3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopencv_calib3d.so.3.4()(64bit) libopencv_core.so.3.4()(64bit) libopencv_dnn.so.3.4()(64bit) libopencv_face.so.3.4()(64bit) libopencv_features2d.so.3.4()(64bit) libopencv_flann.so.3.4()(64bit) libopencv_highgui.so.3.4()(64bit) libopencv_imgcodecs.so.3.4()(64bit) libopencv_imgproc.so.3.4()(64bit) libopencv_ml.so.3.4()(64bit) libopencv_objdetect.so.3.4()(64bit) libopencv_photo.so.3.4()(64bit) libopencv_plot.so.3.4()(64bit) libopencv_shape.so.3.4()(64bit) libopencv_stitching.so.3.4()(64bit) libopencv_tracking.so.3.4()(64bit) libopencv_video.so.3.4()(64bit) libopencv_videoio.so.3.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
