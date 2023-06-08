SUMMARY = "Image processing library for extended camera features and video analysis"
DESCRIPTION = "libXCam is a project for extended camera features and focus on image quality \
improvement and video analysis. There are lots features supported in image \
pre-processing, image post-processing and smart analysis. This library makes \
GPU/CPU/ISP working together to improve image quality. OpenCL is used to improve \
performance in different platforms."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "libxcam1-1.5.0-4.5.aarch64.rpm"
RPM_HASH = "43a1fdc483bbdc3239ce90f791300f6a4c859f573f256ed6a8f588f6345957817234225232549ef970ad83e5231110c5e423cc0a55137e32c2b5fdc4a90131cb"

RPROVIDES:${PN} += "gstreamer1(element-xcamfilter)()(64bit) gstreamer1(element-xcamsrc)()(64bit) libgstxcamfilter.so()(64bit) libgstxcamsrc.so()(64bit) libxcam1 libxcam1(aarch-64) libxcam_capi.so.1()(64bit) libxcam_core.so.1()(64bit) libxcam_gles.so.1()(64bit) libxcam_ocl.so.1()(64bit) libxcam_soft.so.1()(64bit) libxcam_vulkan.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGL.so.1()(64bit) libOpenCL.so.1()(64bit) libOpenCL.so.1(OPENCL_1.0)(64bit) libOpenCL.so.1(OPENCL_1.1)(64bit) libOpenCL.so.1(OPENCL_1.2)(64bit) libOpenCL.so.1(OPENCL_2.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgbm.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopencv_core.so.407()(64bit) libopencv_features2d.so.407()(64bit) libopencv_imgcodecs.so.407()(64bit) libopencv_imgproc.so.407()(64bit) libopencv_photo.so.407()(64bit) libopencv_stitching.so.407()(64bit) libopencv_video.so.407()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libvulkan.so.1()(64bit)"

inherit rpm
