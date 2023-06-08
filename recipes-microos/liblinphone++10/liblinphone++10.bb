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

PV = "5.2.10"

RPM_NAME = "liblinphone++10-5.2.10-2.3.aarch64.rpm"
RPM_HASH = "2f0b21d28bc79801ccc4a34779ab3715c87d2dbfb47614b4e2051ba4347dd3548820c94d3b06158e81e1bc30d57fca302ffc6849898c7b414dcbccf8cac1b875"

RPROVIDES:${PN} += "liblinphone++.so.10()(64bit) liblinphone++10 liblinphone++10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbctoolbox.so.1()(64bit) libbellesip.so.1()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblime.so.0()(64bit) liblinphone.so.10()(64bit) libm.so.6()(64bit) libmediastreamer.so.11()(64bit) libortp.so.15()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
