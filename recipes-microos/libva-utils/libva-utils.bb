SUMMARY = "A collection of utilities and examples to exercise VA-API"
DESCRIPTION = "libva-utils is a collection of utilities and examples to exercise \
VA-API in accordance with the libva project. \
A driver implementation is necessary to properly operate."
LICENSE = "EPL-1.0 & MIT"

PV = "2.18.1"

RPM_NAME = "libva-utils-2.18.1-1.1.aarch64.rpm"
RPM_HASH = "0bb001be8405c58efa04eef1e83d0fdbcdddbf4c63df6d87536fc61dc11be4a22997b7b84b0819372c98afbd7bfc79547b1f4648a9658e9804a1665f8084615b"

RPROVIDES:${PN} += "libva-utils libva-utils(aarch-64) vaapi-tools vaapi-wayland-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libva-drm.so.2()(64bit) libva-wayland.so.2()(64bit) libva-x11.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
