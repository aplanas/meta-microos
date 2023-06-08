SUMMARY = "Dictionary tools for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model. \
 \
This package provides dictionary tools needed by it."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "sunpinyin-tools-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "04231630da4c08d65d166c9c25e49a4a3201dd5226e76f5b64654f56b2186d2a079c46c1143feaf6408c70db12d8079303cd8920acc4c881e0e6d4123a1d496f"

RPROVIDES:${PN} += "sunpinyin-tools sunpinyin-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/make libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
