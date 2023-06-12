SUMMARY = "General tools for Octave"
DESCRIPTION = "General tools for Octave. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "octave-forge-general-2.1.2-2.5.aarch64.rpm"
RPM_HASH = "5b8c80ecd173eeea0a1ed09eea1a5461afa85577e7d0e8ad61b0693bd451c4264577fb814ebe2eb66ab3e13ed05cf755e4e35259b4162e21211ba2e07951f1fd"

RPROVIDES:${PN} += "metainfo() \
metainfo(octave-general.metainfo.xml) \
octave-forge-general \
octave-forge-general(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli"

inherit rpm
