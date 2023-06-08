SUMMARY = "Qt 5 Core Development Binaries"
DESCRIPTION = "Qt 5 Core Development Binaries. It contains Qt5's moc, qmake, \
rcc, uic and syncqt.pl binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libqt5-qtbase-common-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "c2938340abaa17ea8cecb7f14fb34e458c530e808200d139ba0055e815240ea257ddf29d7cd3bf24fd4fa2aec1d40b39bd8587be6005403e189e87aeae25d698"

RPROVIDES:${PN} += "libqt5-qtbase-common-devel libqt5-qtbase-common-devel(aarch-64) rpm_macro(_libqt5_archdatadir) rpm_macro(_libqt5_bindir) rpm_macro(_libqt5_datadir) rpm_macro(_libqt5_docdir) rpm_macro(_libqt5_examplesdir) rpm_macro(_libqt5_importdir) rpm_macro(_libqt5_includedir) rpm_macro(_libqt5_libdir) rpm_macro(_libqt5_libexecdir) rpm_macro(_libqt5_plugindir) rpm_macro(_libqt5_prefix) rpm_macro(_libqt5_qmake) rpm_macro(_libqt5_sysconfdir) rpm_macro(_libqt5_translationdir) rpm_macro(make_jobs) rpm_macro(qmake5) rpm_macro(qmake5_install)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env cmake gcc-c++ ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit) pkg-config"

inherit rpm
