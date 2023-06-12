SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library for testing component."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbctoolbox-tester1-5.2.49-3.1.aarch64.rpm"
RPM_HASH = "8e80fadae9f65d71b4c4fc38f17808ed6302e647126c347fb12eef69e1ce056ad35cb28189ce97f3fa1d6ab1d582257ebf0cd8cf339240375ec9b3d0c15fe60e"

RPROVIDES:${PN} += "libbctoolbox-tester.so.1()(64bit) \
libbctoolbox-tester1 \
libbctoolbox-tester1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libbctoolbox.so.1()(64bit) \
libbcunit.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libmbedcrypto.so.7()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
