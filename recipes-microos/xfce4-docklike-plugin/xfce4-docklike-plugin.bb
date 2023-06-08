SUMMARY = "Docklike Taskbar"
DESCRIPTION = "Docklike Taskbar behaves similarly to many other desktop environments \
and operating systems. Wherein all application windows are grouped \
together as an icon and can be pinned to act as a launcher when the \
application is not running. Commonly referred to as a dock."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.1"

RPM_NAME = "xfce4-docklike-plugin-0.4.1-1.1.aarch64.rpm"
RPM_HASH = "a480fb5a6430831528561fd58dd81ff32b8560efabb78812e9489f9c0c31899393573f8fa2e880bd96968b3c53ecfa03ca5eabfecb5b13066ce67999457c9202"

RPROVIDES:${PN} += "libdocklike.so()(64bit) xfce4-docklike-plugin xfce4-docklike-plugin(aarch-64)"
RDEPENDS:${PN} += "exo-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwnck-3.so.0()(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) xfce4-panel"

inherit rpm
