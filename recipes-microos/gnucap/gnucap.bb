SUMMARY = "Gnu Circuit Analysis Package"
DESCRIPTION = "The primary component is a general purpose circuit simulator. It \
performs nonlinear dc and transient analyses, fourier analysis, and ac \
analysis. Spice compatible models for the MOSFET (level 1-7), BJT, and \
diode are included in this release. \
 \
Gnucap is not based on Spice, but some of the models have been derived \
from the Berkeley models. \
 \
Unlike Spice, the engine is designed to do true mixed-mode \
simulation. Most of the code is in place for future support of event \
driven analog simulation, and true multi-rate simulation."
LICENSE = "GPL-2.0+"

PV = "0.35"

RPM_NAME = "gnucap-0.35-17.29.aarch64.rpm"
RPM_HASH = "c2614a9c639d841382cd24da35860246842edf1aa925b29a37bf3f1d7e4605429351a41d88eba4dfe5a69f71a7e648b8e1099b7f370218fae14ed4200143e6f5"

RPROVIDES:${PN} += "gnucap gnucap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
