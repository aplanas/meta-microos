SUMMARY = "Program to generate and solve Sudoku puzzles in 2D or 3D"
DESCRIPTION = "KSudoku is a program that can generate and solve sudoku puzzles. The \
word Sudoku means 'single number in an alloted place' in Japanese. Some \
cells are filled with a number at the beginnning: the remaining are to \
be filled by the player using numbers from 1 to 9, without repeating a \
number twice on each column, row, or subsquare."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ksudoku-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2361c88413fc8f1244ee721dd50fef5001253244a3184ee231a77f4fe29d1af68f85df9bc1adfac0d28b17ee1a4213b965c17c18b112727e70c37b68507a762a"

RPROVIDES:${PN} += "application() application(org.kde.ksudoku.desktop) config(ksudoku) ksudoku ksudoku(aarch-64) ksudoku5 metainfo() metainfo(org.kde.ksudoku.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLU.so.1()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5KIOCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libOpenGL.so.0()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
