SUMMARY = "Optical Character Recognition Program"
DESCRIPTION = "GNU Ocrad is an OCR (Optical Character Recognition) program based on a feature \
extraction method. It reads images in pbm (bitmap), pgm (greyscale) or ppm \
(color) formats and produces text in byte (8-bit) or UTF-8 formats. \
 \
Also includes a layout analyser able to separate the columns or blocks of text \
normally found on printed pages. \
 \
Ocrad can be used as a stand-alone console application, or as a backend to \
other programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.28"

RPM_NAME = "ocrad-0.28-1.7.aarch64.rpm"
RPM_HASH = "633a78cec63baa59c47ee9a458d539785139bf0a58078363e759fe90d19bba35eb9f27dc824d85658b8a85a8005991b0adb18a9b949b9a568e48d1d7cdc43427"

RPROVIDES:${PN} += "ocrad ocrad(aarch-64)"
RDEPENDS:${PN} += "/bin/sh info ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
