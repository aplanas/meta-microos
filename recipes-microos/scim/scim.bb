SUMMARY = "Smart Chinese/Common Input Method platform"
DESCRIPTION = "SCIM is a developing platform to significantly reduce the difficulty of \
input method development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.18"

RPM_NAME = "scim-1.4.18-5.10.aarch64.rpm"
RPM_HASH = "ab748b1d6b772d114d467c13fc7f4eaa63e42b5686a02db14155cba4fbb7ab54cb667f09227bdb404c3a707beae5893e1c8a1ee63d106472c4316853294e6385"

RPROVIDES:${PN} += "application() application(scim-setup.desktop) config(scim) libscim-1.0.so.8()(64bit) libscim-1.0.so.8(LIBSCIM_1.0)(64bit) libscim-gtkutils-1.0.so.8()(64bit) libscim-x11utils-1.0.so.8()(64bit) rpm_macro(_scim_backenddir) rpm_macro(_scim_binary_version) rpm_macro(_scim_bindir) rpm_macro(_scim_datadir) rpm_macro(_scim_enginedir) rpm_macro(_scim_frontenddir) rpm_macro(_scim_helperdir) rpm_macro(_scim_icondir) rpm_macro(_scim_libdir) rpm_macro(_scim_sysconfdir) rpm_macro(_scim_tabledir) rpm_macro(_scim_uidir) rpm_macro(scim_gtk2_immodule_post) rpm_macro(scim_gtk2_immodule_postun) rpm_macro(scim_gtk2_immodule_requires) scim scim(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libltdl.so.7()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) scim-gtk scim-gtk3"

inherit rpm
