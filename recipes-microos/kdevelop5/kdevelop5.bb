SUMMARY = "Plugin-extensible IDE for C/C++ and other programming languages"
DESCRIPTION = "KDevelop is an integrated development environment (IDE). \
It provides editing, navigation and debugging features for several programming languages, \
as well as integration with multiple build systems and version-control systems \
using a plugin-based architecture. \
KDevelop has parser backends for C, C++ and Javascript/QML, \
with further external plugins supporting e.g. PHP or Python."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdevelop5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "da3b5be3db5d604546e6bfa5670f655b6c22e7be0898d5dea95a96475b1ebc5b0a672dda305b7c42dbb1bddc74a143550670f215212cfcb141939acba548f611"

RPROVIDES:${PN} += "application() \
application(org.kde.kdevelop.desktop) \
application(org.kde.kdevelop_bzr.desktop) \
application(org.kde.kdevelop_git.desktop) \
application(org.kde.kdevelop_kdev4.desktop) \
application(org.kde.kdevelop_ps.desktop) \
application(org.kde.kdevelop_svn.desktop) \
cmake(KDevelop) \
kdevelop \
kdevelop5 \
kdevelop5(aarch-64) \
kdevelop5-cpp-parser \
kdevelop5-plugin-clang \
kdevelop5-plugin-clang-tidy \
kdevelop5-plugin-cppsupport \
kdevelop5-plugin-qmake \
kdevelop5-plugin-qmljs \
libKDevCMakeCommon.so.511()(64bit) \
libKDevClangPrivate.so.511()(64bit) \
libKDevCompileAnalyzerCommon.so.511()(64bit) \
libKDevelopSessionsWatch.so()(64bit) \
libkdevelopdashboarddeclarativeplugin.so()(64bit) \
libkdevelopsessionsplugin.so()(64bit) \
metainfo() \
metainfo(org.kde.kdevelop.appdata.xml) \
mimehandler(application/x-kdevelop) \
mimehandler(x-scheme-handler/bzr) \
mimehandler(x-scheme-handler/bzr+ssh) \
mimehandler(x-scheme-handler/git) \
mimehandler(x-scheme-handler/git+ssh) \
mimehandler(x-scheme-handler/lp) \
mimehandler(x-scheme-handler/svn) \
mimehandler(x-scheme-handler/svn+ssh) \
qt5qmlimport(org.kde.kdevplatform.1) \
qt5qmlimport(org.kde.plasma.private.kdevelopsessions.1)"
RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
clang16 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKDevPlatformDebugger.so.511()(64bit) \
libKDevPlatformDocumentation.so.511()(64bit) \
libKDevPlatformInterfaces.so.511()(64bit) \
libKDevPlatformLanguage.so.511()(64bit) \
libKDevPlatformOutputView.so.511()(64bit) \
libKDevPlatformProject.so.511()(64bit) \
libKDevPlatformSerialization.so.511()(64bit) \
libKDevPlatformShell.so.511()(64bit) \
libKDevPlatformSublime.so.511()(64bit) \
libKDevPlatformUtil.so.511()(64bit) \
libKDevPlatformVcs.so.511()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Codecs.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5Declarative.so.5()(64bit) \
libKF5GuiAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5ItemModels.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5Runner.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5SonnetUi.so.5()(64bit) \
libKF5TextEditor.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5ThreadWeaver.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKasten4Controllers.so.0()(64bit) \
libKasten4Core.so.0()(64bit) \
libKasten4Okteta2Controllers.so.0()(64bit) \
libKasten4Okteta2Core.so.0()(64bit) \
libKasten4Okteta2Gui.so.0()(64bit) \
libOkteta3Core.so.0()(64bit) \
libOkteta3Gui.so.0()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Help.so.5()(64bit) \
libQt5Help.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libclang.so.13()(64bit) \
libclang.so.13(LLVM_13)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkomparediff2.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libprocesscore.so.9()(64bit) \
libprocessui.so.9()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libsvn_client-1.so.0()(64bit) \
libsvn_subr-1.so.0()(64bit) \
libsvn_wc-1.so.0()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(org.kde.plasma.components.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.plasmoid.2) \
qt5qmlimport(org.kde.plasma.private.kdevelopsessions.1)"

inherit rpm
