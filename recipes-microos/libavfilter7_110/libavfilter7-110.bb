SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavfilter7_110-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "23761de7271c0de8a545b5be6fe459e605ca78631df5c0e8796136c6141f2c796e088aaaab8eca78d760a3fbb472912f95fd8498dbebd11918e1312b100c69fa"

RPROVIDES:${PN} += "libavfilter.so.7.110()(64bit) libavfilter.so.7.110(LIBAVFILTER_7)(64bit) libavfilter7_110 libavfilter7_110(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV.so.12()(64bit) libass.so.9()(64bit) libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavcodec58_134 libavformat.so.58.76()(64bit) libavformat.so.58.76(LIBAVFORMAT_58)(64bit) libavformat58_76 libavresample.so.4.0()(64bit) libavresample.so.4.0(LIBAVRESAMPLE_4)(64bit) libavresample4_0 libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libbs2b.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit) libfribidi.so.0()(64bit) libglslang.so.12()(64bit) liblilv-0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmysofa.so.1()(64bit) libpostproc.so.55.9()(64bit) libpostproc.so.55.9(LIBPOSTPROC_55)(64bit) libpostproc55_9 librubberband.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libswresample.so.3.9()(64bit) libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) libswresample3_9 libswscale.so.5.9()(64bit) libswscale.so.5.9(LIBSWSCALE_5)(64bit) libswscale5_9 libva.so.2()(64bit) libvidstab.so.1.1()(64bit) libvmaf.so.1()(64bit) libvulkan.so.1()(64bit) libzimg.so.2()(64bit) libzmq.so.5()(64bit)"

inherit rpm
