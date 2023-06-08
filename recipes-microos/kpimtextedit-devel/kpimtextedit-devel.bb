SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kpimtextedit-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "612de32067b6145a46533ec04edd146a35ecad13ce0fdeadd1b53ba74155023d9ab9b966abb7c702acef040fda278862f1240837e86b20e8fcbe91ae35309080"

RPROVIDES:${PN} += "cmake(KF5PimTextEdit) cmake(KPim5TextEdit) kpimtextedit-devel kpimtextedit-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5SyntaxHighlighting) cmake(KF5TextEditTextToSpeech) cmake(KF5TextWidgets) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPim5TextEdit.so.5()(64bit) libKPim5TextEdit5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
