SUMMARY = "Tool to Extract Game Archives"
DESCRIPTION = "unmass is a tool to extract game archives. \
 \
It supports the following archive types: Crimson Land, Baldur's Gate 2, \
Civilization 4, Doom (WADs), Dune 2, Etherlords 2, Final Fantasy 7 and 8, \
Flashpoint, Knights of Xentar, Metal Gear Solid (DARs), Moorhuhn 2 and 3, \
Megaman Legends, Oni, Operation Flashpoint, Princess Maker 2, Quake 1, \
RollCage, Swine, Unreal Tournament umods, Virtua Fighter bitmaps, MEA exe's, \
and some economy file formats."
LICENSE = "GPL-2.0-only"

PV = "0.92"

RPM_NAME = "unmass-0.92-3.13.aarch64.rpm"
RPM_HASH = "e942f4357d006eac872576a3fcc21d1acef09e669d6fbff491b14a2a4262f7cbbde48c811f24d7b8d51f8298dea2668ae2d32c7f939fb97a751bfa64c6c76cec"

RPROVIDES:${PN} += "unmass unmass(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
