SUMMARY = "LibreOffice Base"
DESCRIPTION = "This module allows you to manage databases, create queries and reports \
to track and manage your information by using LibreOffice office \
suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-base-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "35ea922261c62e1f91e2c02de99d966235a8883d9ef4c370078e88e81ee027bd4d27f67e81d259ec62ffb035d9b8e18af3ef038aae5f2e998f8bca8134c5e6cf"

RPROVIDES:${PN} += "application() application(libreoffice-base.desktop) libabplo.so()(64bit) libdbplo.so()(64bit) libdbulo.so()(64bit) libmysqlclo.so()(64bit) libreoffice-base libreoffice-base(aarch-64) librptlo.so()(64bit) librptuilo.so()(64bit) librptxmllo.so()(64bit) metainfo() metainfo(libreoffice-base.appdata.xml) mimehandler(application/vnd.oasis.opendocument.base) mimehandler(application/vnd.sun.xml.base)"
RDEPENDS:${PN} += "/bin/sh jre-64 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libdbalo.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libi18nlangtag.so()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.35)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) libmergedlo.so()(64bit) libreoffice libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuno_cppu.so.3()(64bit) libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) libuno_cppu.so.3(UDK_3.1)(64bit) libuno_cppu.so.3(UDK_3.3)(64bit) libuno_cppu.so.3(UDK_3_0_0)(64bit) libuno_cppuhelpergcc3.so.3()(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_5.3)(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_7.4)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.1)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.2)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.3)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_3.6)(64bit) libuno_sal.so.3(LIBO_UDK_4.0)(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(LIBO_UDK_4.2)(64bit) libuno_sal.so.3(LIBO_UDK_5.1)(64bit) libuno_sal.so.3(LIBO_UDK_5.3)(64bit) libuno_sal.so.3(PRIVATE_1.6)(64bit) libuno_sal.so.3(PRIVATE_1.7)(64bit) libuno_sal.so.3(PRIVATE_1.8)(64bit) libuno_sal.so.3(UDK_3.1)(64bit) libuno_sal.so.3(UDK_3.11)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.6)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) libuno_salhelpergcc3.so.3()(64bit) libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) pentaho-reporting-flow-engine rtld(GNU_HASH)"

inherit rpm
