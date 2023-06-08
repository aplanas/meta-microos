SUMMARY = "Development Environment for Children"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-1.2.2-17.16.aarch64.rpm"
RPM_HASH = "6844f70828b12d30b365cd5b11416cd702700f91ee6c2752d55c2ddf3f0fa571ddf2ebd5a0c34115badca3dda144abefa8b4b3ec362e692e157a3887b6a8d1a9"

RPROVIDES:${PN} += "application() application(littlewizard.desktop) liblanguage.so.0()(64bit) liblw.so.0()(64bit) littlewizard littlewizard(aarch-64) mimehandler(application/x-littlewizard)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
