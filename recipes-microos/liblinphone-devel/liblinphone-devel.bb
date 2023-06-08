SUMMARY = "Web Phone Development files"
DESCRIPTION = "Linphone is a Web phone with a Qt interface. It lets you make \
two-party calls over IP networks such as the Internet. It uses the IETF \
protocols SIP (Session Initiation Protocol) and RTP (Realtime TransporT \
Protocol) to make calls, so it should be able to communicate with other \
SIP-based Web phones. With several codecs available, it can be used \
with high speed connections as well as 28k modems."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.10"

RPM_NAME = "liblinphone-devel-5.2.10-2.3.aarch64.rpm"
RPM_HASH = "ad0be649410406832aa217964275d8fd8d714c44a98a80450f5ba2b6ab380e8c8ec2283dc9d716038206eaff0cabc0bf951770efbae97e6f0fc6e585d169bb3f"

RPROVIDES:${PN} += "liblinphone-devel liblinphone-devel(aarch-64) linphone-devel pkgconfig(linphone)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbctoolbox-tester.so.1()(64bit) libbctoolbox.so.1()(64bit) libbellesip.so.1()(64bit) libbelr.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libeXosip2-devel libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) liblime.so.0()(64bit) liblinphone++.so.10()(64bit) liblinphone++10 liblinphone-data liblinphone.so.10()(64bit) liblinphone10 libm.so.6()(64bit) libmediastreamer.so.11()(64bit) libortp.so.15()(64bit) libosip2-devel libsoci_core.so.4.0()(64bit) libsoci_sqlite3.so.4.0()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libz.so.1()(64bit) pkgconfig(alsa) pkgconfig(belcard) pkgconfig(belle-sip) pkgconfig(glib-2.0) pkgconfig(libavcodec) pkgconfig(libswscale) pkgconfig(mediastreamer) pkgconfig(speex) soci-devel soci-sqlite3-devel"

inherit rpm
