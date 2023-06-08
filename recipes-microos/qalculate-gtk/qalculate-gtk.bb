SUMMARY = "Multi-purpose cross-platform desktop calculator"
DESCRIPTION = "Qalculate! is a multi-purpose cross-platform desktop calculator. It is \
simple to use but provides power and versatility normally reserved for \
complicated math packages, as well as useful tools for everyday needs \
(such as currency conversion and percent calculation). Features include a \
large library of customizable functions, unit calculations and conversion, \
symbolic calculations (including integrals and equations), arbitrary \
precision, uncertainty propagation, interval arithmetic, plotting, and a \
user-friendly interface (GTK+ and CLI)."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "qalculate-gtk-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "78ec4a1c8583b3eee952b5556a93dde3274c3a3b18fb36af79b7f3ef0fb1f1ee541aeb74a84ba58f86bc28dab0ef8f01ce44e811005166d6e407611aa664ecdc"

RPROVIDES:${PN} += "application() application(qalculate-gtk.desktop) metainfo() metainfo(qalculate-gtk.appdata.xml) qalculate-gtk qalculate-gtk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libqalculate.so.22()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
