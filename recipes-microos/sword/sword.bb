SUMMARY = "Framework for manipulating Bible texts"
DESCRIPTION = "The SWORD Project is an effort to create an ever expanding software package for \
research and study of God and His Word. \
 \
The SWORD Bible Framework allows easy manipulation of Bible texts, commentaries, \
lexicons, dictionaries, etc.  Many frontends are build using this framework. \
An installed module set may be shared between any frontend using the framework."
LICENSE = "GPL-2.0-only & Apache-2.0"

PV = "1.8.1"

RPM_NAME = "sword-1.8.1-1.32.aarch64.rpm"
RPM_HASH = "29b963503be6e43d1b7745f5e42ea78b0d09071c25d240f103cb9d31ef9bb41d236e45a5b1c0cc4df40bbfd99dfc902eac8d1ae36c5d78b889b453950ba556a7"

RPROVIDES:${PN} += "config(sword) sword sword(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libsword-1.8.1.so()(64bit)"

inherit rpm
