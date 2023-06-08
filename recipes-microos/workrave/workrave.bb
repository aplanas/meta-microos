SUMMARY = "Recovery and prevention of Repetitive Strain Injury program"
DESCRIPTION = "Workrave is a program that assists in the recovery and prevention of Repetitive Strain Injury (RSI). The program frequently alerts you to take micro-pauses, rest breaks and restricts you to your daily limit."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-1.10.50-2.1.aarch64.rpm"
RPM_HASH = "416775640bac57e29a9c66e499f85d3b816c1a5a5a35fd51db71e0a8e3787e21b2381bdbfa8884643fcf9a35beafaa0d2e45928634291f506ff5648ab0f5573d"

RPROVIDES:${PN} += "application() application(workrave.desktop) libworkrave-private-1.0.so.0()(64bit) metainfo() metainfo(workrave.appdata.xml) workrave workrave(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXss.so.1()(64bit) libXtst.so.6()(64bit) libatkmm-1.6.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcairomm-1.0.so.1()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgdkmm-3.0.so.1()(64bit) libgio-2.0.so.0()(64bit) libgiomm-2.4.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.4.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkmm-3.0.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libpangomm-1.4.so.1()(64bit) libsigc-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) typelib(Clutter) typelib(GLib) typelib(GObject) typelib(Gio) typelib(St) typelib(Workrave)"

inherit rpm
