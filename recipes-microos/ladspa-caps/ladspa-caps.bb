SUMMARY = "LADSPA caps plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
caps plugins, the C* Audio Plugin Suite including instrument amplifier \
emulation, stomp-box classics, versatile virtual analog oscillators, \
fractal oscillation, reverb, equalization and others."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.26"

RPM_NAME = "ladspa-caps-0.9.26-1.11.aarch64.rpm"
RPM_HASH = "b2ba488fd2b748b5cf6c72b7c47e31a11eb7a09396dcc387b11ce4849fcf33ba0916b87d14fe8d2ed49607c94a9a15915babae5df0ece96ad803be565b46c7ec"

RPROVIDES:${PN} += "ladspa-caps ladspa-caps(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
