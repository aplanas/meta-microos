SUMMARY = "Various plugins for the Qt Cryptographic Architecture 2"
DESCRIPTION = "This package provides a generic Qt cryptographic architecture, \
including a library and a plug-in for using all supported capabilities \
of openssl, like SSL/TLS, X509, RSA, SHA1, MD5, Blowfish, 3DES, and \
AES. \
 \
It can be extended by further plug-ins, for example, with qca-sasl for \
SASL support."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.6"

RPM_NAME = "qca-qt5-plugins-2.3.6-1.1.aarch64.rpm"
RPM_HASH = "e8081566600f73b41747d65e5ee8a6918201742752d1b30d7d60089f5e64367ad0c7d3022e572fb62dc441486116dcc203304a7047b17a247dd0d835c6ae7285"

RPROVIDES:${PN} += "libqca-cyrus-sasl.so()(64bit) libqca-nss.so()(64bit) libqca-pkcs11.so()(64bit) libqca-qt5-plugins qca-qt5-plugins qca-qt5-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libnss3.so(NSS_3.3)(64bit) libpkcs11-helper.so.1()(64bit) libqca-qt5.so.2()(64bit) libsasl2.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
