SUMMARY = "ACL viewer and editor for MATE"
DESCRIPTION = "MATE eiciel is a Graphical editor for access control lists (ACLs) \
and extended attributes (xattr), either as an extension within \
Caja, or as a standalone utility."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.1"

RPM_NAME = "mate-eiciel-1.20.1-2.9.aarch64.rpm"
RPM_HASH = "bd1d36b58d75d595b2cbccbac6266d76af6d7899025c23502d9775586470eb411ac0c135a726a0356d7db2014a667fd29e8e501831fca596c393c43be626ca5a"

RPROVIDES:${PN} += "application() application(org.mate-desktop.mate-eiciel.desktop) mate-eiciel mate-eiciel(aarch-64) metainfo() metainfo(org.mate-desktop.mate-eiciel.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libatkmm-1.6.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairomm-1.0.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdkmm-3.0.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgtk-3.so.0()(64bit) libgtkmm-3.0.so.1()(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
