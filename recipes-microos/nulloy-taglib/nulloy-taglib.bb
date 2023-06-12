SUMMARY = "Taglib plugin for nulloy"
DESCRIPTION = "This package contains the taglib plugin for nulloy - a music player \
with a Waveform Progressbar."
LICENSE = "GPL-3.0-only"

PV = "0.9.5"

RPM_NAME = "nulloy-taglib-0.9.5-1.9.aarch64.rpm"
RPM_HASH = "a5d4fb8401d7012dbc84a7c71d05c0013bee50a88c2e79c0fb8ca01173bbbdb8f83262ca009a18b54a22b86fae1c00386eaf9807a8f11b62632a251e2c21cfe4"

RPROVIDES:${PN} += "libplugin_taglib.so()(64bit) \
nulloy-taglib \
nulloy-taglib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libtag.so.1()(64bit) \
nulloy"

inherit rpm
