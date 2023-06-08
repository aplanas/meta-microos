SUMMARY = "Tools to Create, Alter, and Inspect Matroska Files"
DESCRIPTION = "Tools to create and manipulate Matroska files (extensions .mkv and .mka), a new \
container format for audio and video files. Includes command line tools \
mkvextract, mkvinfo, mkvmerge and mkvpropedit."
LICENSE = "GPL-2.0-or-later"

PV = "76.0"

RPM_NAME = "mkvtoolnix-76.0-1.1.aarch64.rpm"
RPM_HASH = "0204c3898164be447673d223a67586af62ec8f8d3cd62b6b551193b9abe2320f170fb45edc06b8298da6eef701933e39f51d1bb85267a8910815dd7745dcdfb5"

RPROVIDES:${PN} += "mkvtoolnix mkvtoolnix(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC.so.12()(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libboost_filesystem.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdvdread.so.8()(64bit) libebml.so.5()(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmatroska.so.7()(64bit) libmatroska.so.7(V_1.7.0)(64bit) libogg.so.0()(64bit) libpugixml.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libvorbis.so.0()(64bit) libz.so.1()(64bit)"

inherit rpm
