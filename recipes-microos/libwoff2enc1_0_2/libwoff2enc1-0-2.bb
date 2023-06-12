SUMMARY = "Shared library for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains the shared library for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "libwoff2enc1_0_2-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "1aa9d85948bf52ccd5804389acab945eb7f21a7c3b84222ea46d24c3a6023dfff7de1b3e0b16b93207fbcc7596e67e694e50e908f546248f06bec03f1e898355"

RPROVIDES:${PN} += "libwoff2enc.so.1.0.2()(64bit) \
libwoff2enc1_0_2 \
libwoff2enc1_0_2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbrotlienc.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwoff2common.so.1.0.2()(64bit)"

inherit rpm
