SUMMARY = "Spell checker library and tool based on HFST"
DESCRIPTION = "Minimal HFST optimized lookup format based spell checker library and \
a demonstrational implementation of command line based spell checker."
LICENSE = "Apache-2.0"

PV = "0.5.1"

RPM_NAME = "hfst-ospell-0.5.1-4.3.aarch64.rpm"
RPM_HASH = "19b39fcc448aa8e0e64b25d3db02909941a4353b165fb4174eece7ce708410f5746686fc94ac439dd928c79df18617ed15f99b77745c481682d65dc0cf185214"

RPROVIDES:${PN} += "hfst-ospell hfst-ospell(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhfstospell.so.11()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.31)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
