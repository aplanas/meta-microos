SUMMARY = "Terminal program with GLES renderer and low latency"
DESCRIPTION = "An X terminal emulator rendering through OpenGL ES shaders. \
It has good input latency and VTxxx emulation over most other \
terminals, ranging second after xterm (as of 2022). \
It uses FreeType, but does not support fontconfig, thus won't find \
fonts by their usual names. (See FAQ for details.)"
LICENSE = "GPL-3.0-or-later"

PV = "0.14"

RPM_NAME = "zutty-0.14-1.1.aarch64.rpm"
RPM_HASH = "6168351a31c24536f4e1e5db31a0784f36bdfbc8baa4e025c25ff5ffb01a75871b6af989c1b6874a8da1e3d30080234458678f5690eaa37828dc5ef9f9565a78"

RPROVIDES:${PN} += "zutty zutty(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libEGL.so.1()(64bit) libGLESv2.so.2()(64bit) libX11.so.6()(64bit) libXmu.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfreetype.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
