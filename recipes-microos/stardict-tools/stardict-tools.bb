SUMMARY = "StarDict Editor"
DESCRIPTION = "This package contains the dictionary conversion tools which can convert \
dictionaries of DICT, wquick, mova and pydict to stardict format."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "stardict-tools-3.0.1-85.10.aarch64.rpm"
RPM_HASH = "597301ce5d3df1122b65d1b07c85cd61285eaf5df1f0af0d2e880a058ae886ae5610aa3fa45952cc1f9d8ab4a5a38a272758cfcaba1c45a0035dc4c128e2d0b9"

RPROVIDES:${PN} += "application() \
application(stardict-editor.desktop) \
stardict-tools \
stardict-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
