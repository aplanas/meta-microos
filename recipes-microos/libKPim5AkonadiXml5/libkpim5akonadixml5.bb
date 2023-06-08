SUMMARY = "Akonadi Xml library"
DESCRIPTION = "This package includes the Akonadi Xml library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5AkonadiXml5-23.04.0-2.1.aarch64.rpm"
RPM_HASH = "00ef98043f70968c28dc06fff02cacf1607d88347a65b2e4334bde552831adb5f5103d40225cc340edd5cd71933fa0e422286a4b1b466a3a680908c8484bf9f1"

RPROVIDES:${PN} += "libKPim5AkonadiXml.so.5()(64bit) libKPim5AkonadiXml5 libKPim5AkonadiXml5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKPim5AkonadiCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.2)(64bit)"

inherit rpm
