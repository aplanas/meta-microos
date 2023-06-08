SUMMARY = "GPU Trace Visualizer"
DESCRIPTION = "Gpuvis is a Linux GPU profiler similar to GPUView on Windows. It is designed to work with trace-cmd captures and help track down Linux gpu and application performance issues."
LICENSE = "MIT"

PV = "20230221"

RPM_NAME = "gpuvis-20230221-1.1.aarch64.rpm"
RPM_HASH = "e8bdeb265bd17fa668dc9b399680d1e00471737ea1c5129c6ebd3f2647fc55854349ee140562fbbbb7cc6ae5723d47f8411b078e8b1f4006bc87e9d3e39644e7"

RPROVIDES:${PN} += "gpuvis gpuvis(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
