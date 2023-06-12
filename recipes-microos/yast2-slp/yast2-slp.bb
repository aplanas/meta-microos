SUMMARY = "YaST2 - SLP Agent and Library"
DESCRIPTION = "This package provides YaST modules to lookup/advertise services with SLP."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "yast2-slp-4.6.0-1.2.aarch64.rpm"
RPM_HASH = "d70372bb76a73f123f2e052326cb63f2eff396da2e4e30cf6ccde066c2f43386b24310e5b252ff4cd8f6c3bc99cd3b36562905f9aa7a08c0d73affb47d33e4cd"

RPROVIDES:${PN} += "libpy2ag_slp.so.2()(64bit) \
yast2-slp \
yast2-slp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libscr.so.3()(64bit) \
libslp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
liby2.so.4()(64bit) \
liby2util.so.5()(64bit) \
libycp.so.5()(64bit) \
libycpvalues.so.6()(64bit) \
openslp \
yast2 \
yast2-ruby-bindings"

inherit rpm
