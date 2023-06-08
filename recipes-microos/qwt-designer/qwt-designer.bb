SUMMARY = "Plugin for the Qt Interface designer"
DESCRIPTION = "The qwt-designer package contains the plugin for the Qt User Interface \
designer tool."
LICENSE = "SUSE-QWT-1.0"

PV = "5.2.3_qt5+git20181129.2819734"

RPM_NAME = "qwt-designer-5.2.3_qt5+git20181129.2819734-3.18.aarch64.rpm"
RPM_HASH = "2adc4608303997e4108c6bd1841aa45a5e752544199c8526fdbbd63dd103ae59051e85d250de24cdd69d2fee461b758b4b083a43bd4d4e63860a66b928428693"

RPROVIDES:${PN} += "libqwt5_designer_plugin.so()(64bit) qwt-designer qwt-designer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Designer.so.5()(64bit) libQt5Designer.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libqwt5-qt5.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qwt-devel"

inherit rpm
