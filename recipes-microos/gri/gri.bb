SUMMARY = "A language for scientific illustration"
DESCRIPTION = "Gri is a language for scientific graphics programming.  It is a \
command-driven application, as opposed to a click/point application. \
It is analogous to latex, and shares the property that extensive power \
is the reward for tolerating a modest learning curve.  Gri output is \
in industry-standard PostScript, suitable for incorporation in \
documents prepared by various text processors. \
 \
Gri can make x-y graphs, contour-graphs, and image graphs.  In \
addition to high-level capabilities, it has enough low-level \
capabilities to allow users to achieve a high degree of customization. \
Precise control is extended to all aspects of drawing, including \
line-widths, colors, and fonts.  Text includes a subset of the tex \
language, so that it is easy to incorporate Greek letters and \
mathematical symbols in labels."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.23"

RPM_NAME = "gri-2.12.23-23.13.aarch64.rpm"
RPM_HASH = "7e02ca828c17f5abc01542865e26364365869557fc53f68f5c691cd2aee63fc8b71a0dbaaea66955cc13e244825df235952bf64c16e9b4b798c5c9b2b26fad47"

RPROVIDES:${PN} += "gri \
gri(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
