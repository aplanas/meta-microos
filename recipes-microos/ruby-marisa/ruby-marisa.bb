SUMMARY = "Ruby bindings for marisa"
DESCRIPTION = "Ruby bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "ruby-marisa-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "fa78a527e2bc350d84cf9a818939b34efebf96bec0c662601058c46f96fd4186a94da0ac226ef2f7d2c50d457be86c3a4ef057a8b909b76d2ac30b25f0e82222"

RPROVIDES:${PN} += "ruby-marisa ruby-marisa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libmarisa.so.0()(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) marisa ruby"

inherit rpm
