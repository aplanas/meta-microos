SUMMARY = "Chewing IM engine for SCIM platform"
DESCRIPTION = "Chewing IM engine for SCIM platform."
LICENSE = "GPL-2.0+"

PV = "0.3.6+git20150821.5df4075"

RPM_NAME = "scim-chewing-0.3.6+git20150821.5df4075-1.31.aarch64.rpm"
RPM_HASH = "35dd2501752b4e210b64fde1b5d36b4fe6187d519640b5394405060910031a32304365e3d4d554b134169c8015252a4c52a4832d1b3f5599a37780227aecf727"

RPROVIDES:${PN} += "scim-chewing scim-chewing(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libchewing.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libscim-1.0.so.8()(64bit) libscim-1.0.so.8(LIBSCIM_1.0)(64bit) libscim-gtkutils-1.0.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
