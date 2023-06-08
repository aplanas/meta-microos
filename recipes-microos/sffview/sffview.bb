SUMMARY = "Viewer for Structured Fax Files (.sff) used by ISDN applications"
DESCRIPTION = "The CAPI interface for programming ISDN hardware expects and gives you \
faxes in the 'Structured Fax File' (SFF) format. \
 \
SffView is a viewer for SFF files. SffView is written in C++ using the \
wxWidgets toolkit."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "sffview-0.5-3.3.aarch64.rpm"
RPM_HASH = "e2c817feb92d12bd4dd7f03e2bdcf7286728ea7bddc8f74aed4aa65cf6f5f0bc6f32c322744fb560e20cd079f63399eec22601fa41162f7cc6327b1fa2b2b79e"

RPROVIDES:${PN} += "sffview sffview(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
