SUMMARY = "Web Phone Command Line Interface"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems. \
 \
This package contains the command line interface."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.10"

RPM_NAME = "linphone-cli-5.2.10-2.3.aarch64.rpm"
RPM_HASH = "b8901dc1c0c713d8e55666a827f300cf824e738c4672fee5aec8fedb47817d5c5007936f7da1d4077c00105e035994c2411d5ba4da3f9bccd767a620db45aa7b"

RPROVIDES:${PN} += "linphone-cli linphone-cli(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbctoolbox.so.1()(64bit) libbellesip.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblime.so.0()(64bit) liblinphone-data liblinphone.so.10()(64bit) libm.so.6()(64bit) libmediastreamer.so.11()(64bit) libortp.so.15()(64bit) libreadline.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
