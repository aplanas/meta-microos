SUMMARY = "HTML to ASCII Converter"
DESCRIPTION = "A tool for converting from HTML to ASCII. It can reasonably handle \
tables."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.1"

RPM_NAME = "html2text-2.1.1-1.3.aarch64.rpm"
RPM_HASH = "fc75bf9a9ecaf52ef8ecad919ae5a79dd0f54c9712add2768d6a4166208127e1745114ef909b97d88c69e7972d3e56846d8a46e684e35beeded2db3d5421f262"

RPROVIDES:${PN} += "html2text \
html2text(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
update-alternatives"

inherit rpm
