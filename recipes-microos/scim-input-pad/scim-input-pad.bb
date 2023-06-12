SUMMARY = "An onscreen input pad to easily input symbols"
DESCRIPTION = "An onscreen input pad to easily input symbols"
LICENSE = "GPL-2.0+"

PV = "0.1.3.20130804"

RPM_NAME = "scim-input-pad-0.1.3.20130804-6.30.aarch64.rpm"
RPM_HASH = "7399738a709a76f5d8c69c392bc2c87eaf2c5d9b4768105a3eb38441f6f3fad190839ea2ce37adc4450998f81ec69575a4abec265bf7b983bab8780cbe165480"

RPROVIDES:${PN} += "libscim-input-pad.so.0()(64bit) \
scim-input-pad \
scim-input-pad(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libscim-1.0.so.8()(64bit) \
libscim-1.0.so.8(LIBSCIM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
