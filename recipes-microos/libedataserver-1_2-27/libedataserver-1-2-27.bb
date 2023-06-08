SUMMARY = "Evolution Data Server's Utilities Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libedataserver-1_2-27-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "351177165d221822e1c28f407eca89070446230b591bad013e266ec04a0d5c212b7fd7fa3170b1ac22a3731909cabb8e3f264894cbe1d04e1ce62c8ce75c2a83"

RPROVIDES:${PN} += "libedataserver-1.2.so.27()(64bit) libedataserver-1_2-27 libedataserver-1_2-27(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig evolution-data-server ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libedbus-private.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libsecret-1.so.0()(64bit) libsoup-3.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit)"

inherit rpm
