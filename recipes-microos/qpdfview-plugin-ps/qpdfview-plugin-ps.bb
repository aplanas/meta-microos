SUMMARY = "qpdfview plugin: PostScript documents"
DESCRIPTION = "This plugin is required to read PostScript documents \
(*.ps files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-ps-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "5ad91e0296d6bef80c681760fa5e3165b9821df4c082c3f7c47b57dffe1819b94d060a97eae15b6095f675a78f5194597db280fc3134567e329b77c6823e3e5e"

RPROVIDES:${PN} += "libqpdfview_ps.so()(64bit) qpdfview-plugin-ps qpdfview-plugin-ps(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libspectre.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qpdfview"

inherit rpm
