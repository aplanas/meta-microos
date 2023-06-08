SUMMARY = "CPU Frequency Scaling Monitor Plugin for the Xfce Panel"
DESCRIPTION = "The CpuFreq scaling monitor plugin can be used to monitor the current CPU \
frequency and currently active governor."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.8"

RPM_NAME = "xfce4-cpufreq-plugin-1.2.8-1.3.aarch64.rpm"
RPM_HASH = "1b469fc1e24651bd67c06bd1eded5e7c277a9c4cdbe14d2813ed523a6c398a29c60ece7858a9154bc557e0674c7c73a75669263156b91f6a3da9dc450ce4c257"

RPROVIDES:${PN} += "libcpufreq.so()(64bit) xfce4-cpufreq-plugin xfce4-cpufreq-plugin(aarch-64) xfce4-panel-plugin-cpufreq"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libxfce4panel-2.0.so.4()(64bit) libxfce4ui-2.so.0()(64bit) libxfce4util.so.7()(64bit) xfce4-panel"

inherit rpm
