SUMMARY = "GNOME Extensions for LibreOffice"
DESCRIPTION = "This package contains some GNOME extensions and GTK2 interface for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-gnome-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "61a44633883145d3700a0479fa6fa39f1f717e3329e1cc90d4f3e0b6db212b1a79ad53f51d8e926258aa3bdabc08a553d9b54e5be98fa744187e9e98ea727e38"

RPROVIDES:${PN} += "libevoablo.so()(64bit) liblosessioninstalllo.so()(64bit) libreoffice-gnome libreoffice-gnome(aarch-64) libucpgio1lo.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libfilelo.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libi18nlangtag.so()(64bit) libm.so.6()(64bit) libmergedlo.so()(64bit) libreoffice libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libuno_cppu.so.3()(64bit) libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) libuno_cppu.so.3(UDK_3.1)(64bit) libuno_cppu.so.3(UDK_3_0_0)(64bit) libuno_cppuhelpergcc3.so.3()(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_7.4)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.1)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(LIBO_UDK_5.1)(64bit) libuno_sal.so.3(PRIVATE_1.8)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) libuno_salhelpergcc3.so.3()(64bit) libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) rtld(GNU_HASH)"

inherit rpm
