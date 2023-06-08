SUMMARY = "HEIF/AVIF file format decoder and encoder"
DESCRIPTION = "libheif is an ISO/IEC 23008-12:2017 HEIF and AVIF (AV1 Image File Format) file \
format decoder and encoder. \
 \
HEIF and AVIF are new image file formats employing HEVC (H.265) or AV1 image \
coding, respectively, for the best compression ratios currently possible. \
 \
For AVIF libaom, dav1d, or rav1e are used as codecs. HEIF support is not \
provided."
LICENSE = "GPL-2.0-or-later"

PV = "1.16.1"

RPM_NAME = "libheif1-1.16.1-2.1.aarch64.rpm"
RPM_HASH = "12ffe91adf94ca5cd3cfaac4cf66da2af03f78a0ebc6c92ecf63662fcfaebd7f30e248968c4fa0df664ed380dc25aeae0cd06be02ba4ada3c967a8a1725df57e"

RPROVIDES:${PN} += "libheif.so.1()(64bit) libheif1 libheif1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaom.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdav1d.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsharpyuv.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
