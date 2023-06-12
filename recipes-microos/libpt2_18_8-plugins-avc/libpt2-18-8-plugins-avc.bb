SUMMARY = "AVC plugin for ptlib"
DESCRIPTION = "This plugin enables AVC (firewire control for digital video cameras) \
support in ptlib."
LICENSE = "MPL-1.0"

PV = "2.18.8"

RPM_NAME = "libpt2_18_8-plugins-avc-2.18.8-1.5.aarch64.rpm"
RPM_HASH = "c82cdfd8889397a64a235ff411a8f7ce84962adfa23747d812464f8addbe410a2401a15d1f88083661a329c60a32ec0c5bfb315b9a911ec5e2089049ffeba2b0"

RPROVIDES:${PN} += "libpt2-plugins-avc \
libpt2-video-plugin \
libpt2_18_8-plugins-avc \
libpt2_18_8-plugins-avc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdv.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpt.so.2.18.8()(64bit) \
libpt2_18_8 \
libraw1394.so.11()(64bit) \
librom1394.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
