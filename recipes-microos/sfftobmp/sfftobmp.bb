SUMMARY = "Tool to convert Structured Fax Files (.sff) to other image formats"
DESCRIPTION = "The CAPI interface for programming ISDN hardware expects and gives \
faxes in the 'Structured Fax File' (SFF) format. \
 \
SffToBmp is a converter tool, written in C++, to transform SFF files to \
BMP, JPEG or multipage TIFF format. In addition generation of PBM files \
(Portable Bitmap) is also possible which can be transformed into nearby \
all other graphics formats using the PBMPLUS tools that are included in \
almost every Linux distribution nowadays."
LICENSE = "MIT"

PV = "3.1.4"

RPM_NAME = "sfftobmp-3.1.4-8.16.aarch64.rpm"
RPM_HASH = "6ff5f0061ec3b505f7ac6e99c2c0c102bb7fb24b0ed8e0b4fb35a25c8e69859f618578b67cb6c1ec55f59bd7609132669eec4207f543bafdd7a9e516747cfdfb"

RPROVIDES:${PN} += "sfftobmp sfftobmp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_filesystem.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit)"

inherit rpm
