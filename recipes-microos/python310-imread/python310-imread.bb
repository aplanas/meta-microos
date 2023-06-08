SUMMARY = "Image reading library"
DESCRIPTION = "Mahotas-imread is a simple module with a small number of functions: \
 \
imread \
    Reads an image file \
imread_multi \
    Reads an image file with multiple images. Currently, TIFF and STK (a TIFF \
    sub-based format) support this function. \
imsave \
    Writes an image file"
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python310-imread-0.7.4-3.11.aarch64.rpm"
RPM_HASH = "11c6cdedb3db6b72c410fe028ade7bcd9e6e49a098932915352ad791425610cbe4424b29609ea23fda0ca2e23a5fa370c8b643d8dc9350845242632961f7f6df"

RPROVIDES:${PN} += "python3-imread python3.10dist(imread) python310-imread python310-imread(aarch-64) python3dist(imread)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) python(abi) python310-numpy"

inherit rpm
