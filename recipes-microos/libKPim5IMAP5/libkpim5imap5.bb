SUMMARY = "KDE PIM Libraries: IMAP APIs"
DESCRIPTION = "This package provides the core library to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5IMAP5-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "54d274720243238228343c95717da8dfeb372376806320c81a0558139633003d09981866afe9d6b6f9fb13b668b569fe756f522eb4f27463447a8ad784b8c509"

RPROVIDES:${PN} += "kimap libKPim5IMAP.so.5()(64bit) libKPim5IMAP5 libKPim5IMAP5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig cyrus-sasl-crammd5 cyrus-sasl-digestmd5 cyrus-sasl-gssapi cyrus-sasl-plain ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKPim5Mime.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) sasl2-kdexoauth2"

inherit rpm
