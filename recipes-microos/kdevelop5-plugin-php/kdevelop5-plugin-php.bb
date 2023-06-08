SUMMARY = "PHP plugin for Kdevelop5 Integrated Development Environment"
DESCRIPTION = "PHP plugin for Kdevelop Integrated Development Environment \
 \
This plugin enables support for the following features for developing \
web applications in PHP using Kdevelop5. \
 \
  * PHP built-in functions, classes, constants, superglobals \
  * user-defined functions, classes, constants, superglobals, variables, etc. \
  * proper code completion for objects which respects access modifiers (private, \
    public, protected) and differentiates between static/non-static members and \
    methods \
  * code completion for overridable and implementable functions inside classes \
  * hints in the argument list of function- and method class \
  * sane code completion after keywords such as extends, implements, catch(), \
    new, throw and some more"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdevelop5-plugin-php-23.04.0-1.2.aarch64.rpm"
RPM_HASH = "c998bf2a69c88e314effe0bdc2c76ec039f0ef2db031df603ecfe48af9c2b6a031464a000e800096e49d19f712e30acdc6fe67b11da4ab5b4e23f9aa6430a240"

RPROVIDES:${PN} += "kdevelop5-plugin-php kdevelop5-plugin-php(aarch-64) libkdevphpcompletion.so()(64bit) libkdevphpduchain.so()(64bit) libkdevphpparser.so()(64bit) metainfo() metainfo(org.kde.kdev-php.metainfo.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig kdevelop5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKDevPlatformDocumentation.so.511()(64bit) libKDevPlatformInterfaces.so.511()(64bit) libKDevPlatformLanguage.so.511()(64bit) libKDevPlatformOutputView.so.511()(64bit) libKDevPlatformProject.so.511()(64bit) libKDevPlatformSerialization.so.511()(64bit) libKDevPlatformUtil.so.511()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5ThreadWeaver.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
