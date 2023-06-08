SUMMARY = "LibKleo library for kdepim"
DESCRIPTION = "This package contains the libkleo library, a library used by KDE PIM \
applications to handle cryptographic key and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5libkleo5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0878d53c2552d12b1921c5c8f74723b7dadde12428c909f688f9741a4f93d717f5ab952dea6b97773461c104ac1a29e8f1cdfe92eea0edf1d01be42787307102"

RPROVIDES:${PN} += "libKPim5Libkleo.so.5()(64bit) libKPim5libkleo5 libKPim5libkleo5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemModels.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKPim5TextEdit.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libgpgmepp.so.6()(64bit) libkleo libqgpgme.so.15()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
