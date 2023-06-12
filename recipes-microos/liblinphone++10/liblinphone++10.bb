SUMMARY = "Web Phone C++ library"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains a C++ library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.50"

RPM_NAME = "liblinphone++10-5.2.50-1.1.aarch64.rpm"
RPM_HASH = "a50dc52cd1592f49094795cfe34cc8679902f602e0e3bafe68e75bc7b10b9fe820f7e55ee292c7dba33d6dc19a674744d7ce087e67a04259f7344e99e37b8337"

RPROVIDES:${PN} += "liblinphone++.so.10()(64bit) \
liblinphone++10 \
liblinphone++10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbctoolbox.so.1()(64bit) \
libbellesip.so.1()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblime.so.0()(64bit) \
liblinphone.so.10()(64bit) \
libm.so.6()(64bit) \
libmediastreamer.so.11()(64bit) \
libortp.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm
