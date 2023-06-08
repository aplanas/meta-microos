SUMMARY = "Mind map, diagram, and note-taking tool"
DESCRIPTION = "Heimer is a desktop application for creating mind maps and other \
suitable diagrams. Features: \
* Adjustable grid \
* Automatic layout optimization \
* Autosave \
* Easy-to-use UI \
* Export to PNG or SVG \
* Forever 100% free \
* Full undo/redo \
* Nice animations \
* Quickly add node text and edge labels \
* Save/load in XML-based .ALZ-files \
* Translations in English (default), Chinese, Dutch, Finnish, French, Italian, Spanish \
* Very fast \
* Zoom in/out/fit \
* Zoom with mouse wheel"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "4.1.0"

RPM_NAME = "heimer-4.1.0-1.1.aarch64.rpm"
RPM_HASH = "a933416ee35cadc19bd1987bddbd3bb0d76dc58e534023175cf6a3581c540c434067ee234c05a096838a1d905a94dc1842349ea8936004f0d7e9ce4c367e1035"

RPROVIDES:${PN} += "application() application(heimer.desktop) heimer heimer(aarch-64) metainfo() metainfo(heimer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
