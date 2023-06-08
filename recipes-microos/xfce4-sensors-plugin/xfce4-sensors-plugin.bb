SUMMARY = "Hardware Sensor Plugin for the Xfce Panel"
DESCRIPTION = "The Sensors plugin and standalone application allow to monitor various hardware \
sensors supported by libsensors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "xfce4-sensors-plugin-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "8ab6f4645246aefd7d4c5fc9fc1febf8dd1db23ea152fcb5c085f22266e9bf4799cfd82c1a7a81a83a4b7f7a06fc13494aa7ccf8fa1c2b725b36de3a6c9ff365"

RPROVIDES:${PN} += "application() application(xfce4-sensors.desktop) libxfce4-sensors-plugin.so()(64bit) libxfce4sensors.so.5()(64bit) xfce4-panel-plugin-sensors xfce4-sensors-plugin xfce4-sensors-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libsensors.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) xfce4-panel"

inherit rpm
