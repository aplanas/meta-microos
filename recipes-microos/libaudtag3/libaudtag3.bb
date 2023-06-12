SUMMARY = "ID3 and APE metadata support for Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.3"

RPM_NAME = "libaudtag3-4.3-1.3.aarch64.rpm"
RPM_HASH = "5215286b1815145d2998b23752c2413507acb3aa37041a8b7f37a1a26d9d2042ba9ead54b138bd8bc04026ee37dfaad8625d562f7727013c97c5429544f4c7c6"

RPROVIDES:${PN} += "libaudtag.so.3()(64bit) \
libaudtag3 \
libaudtag3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaudcore.so.5()(64bit) \
libaudcore5 \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
