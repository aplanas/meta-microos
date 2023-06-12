SUMMARY = "Tests for the glib2 package"
DESCRIPTION = "The glib2-tests-devel package contains tests that can be used to verify \
the functionality of the installed glib2 package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-tests-devel-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "0d1c496ab52a34a9b85257be60b98c75da6941a5c7402e1057f7aa22b4a94df38a41eb87d7be3ccf006fcdca41394c18e3ad65e7decec53dee40aeab56696420"

RPROVIDES:${PN} += "glib2-tests \
glib2-tests-devel \
glib2-tests-devel(aarch-64) \
libgdbus-example-objectmanager.so()(64bit) \
libmoduletestplugin_a_library.so()(64bit) \
libmoduletestplugin_a_plugin.so()(64bit) \
libmoduletestplugin_b_library.so()(64bit) \
libmoduletestplugin_b_plugin.so()(64bit) \
libresourceplugin.so()(64bit) \
libtestmodulea.so()(64bit) \
libtestmoduleb.so()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
glib2-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgthread-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
