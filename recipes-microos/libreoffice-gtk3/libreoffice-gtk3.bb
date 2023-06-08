SUMMARY = "Gtk3 interface for LibreOffice"
DESCRIPTION = "This package contains Gtk3 interface rendering option for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-gtk3-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "baa73b370c040a6501edcc60a505e4188f8c69fc2e4136bfd0ed9de135df00555c7a636ee941fe78f5f9ed638352fa15538621494e9bc40612c14b18f3df8edc"

RPROVIDES:${PN} += "libreoffice-gtk3 libreoffice-gtk3(aarch-64) libvclplug_gtk3lo.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libepoxy.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libi18nlangtag.so()(64bit) libjvmaccesslo.so()(64bit) libm.so.6()(64bit) libmergedlo.so()(64bit) libpango-1.0.so.0()(64bit) libreoffice-gnome libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libuno_cppu.so.3()(64bit) libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) libuno_cppu.so.3(UDK_3.1)(64bit) libuno_cppu.so.3(UDK_3_0_0)(64bit) libuno_cppuhelpergcc3.so.3()(64bit) libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3.6)(64bit) libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) libuno_sal.so.3()(64bit) libuno_sal.so.3(LIBO_UDK_3.6)(64bit) libuno_sal.so.3(LIBO_UDK_4.0)(64bit) libuno_sal.so.3(LIBO_UDK_4.1)(64bit) libuno_sal.so.3(LIBO_UDK_4.2)(64bit) libuno_sal.so.3(LIBO_UDK_5.1)(64bit) libuno_sal.so.3(PRIVATE_1.6)(64bit) libuno_sal.so.3(PRIVATE_1.8)(64bit) libuno_sal.so.3(UDK_3.1)(64bit) libuno_sal.so.3(UDK_3.3)(64bit) libuno_sal.so.3(UDK_3.6)(64bit) libuno_sal.so.3(UDK_3.8)(64bit) libuno_sal.so.3(UDK_3_0_0)(64bit) rtld(GNU_HASH)"

inherit rpm
