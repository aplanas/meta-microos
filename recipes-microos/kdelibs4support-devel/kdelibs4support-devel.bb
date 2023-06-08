SUMMARY = "Code and utilities to ease the transition to KDE Frameworks 5"
DESCRIPTION = "This package includes CMake macros and C++ \
classes whose functionality has been replaced by code in CMake, Qt and \
other frameworks. \
 \
Code should aim to port away from this framework eventually.  The API \
documentation of the classes in this framework and the notes at \
<https://community.kde.org/Frameworks/Porting_Notes> should help with \
this. \
 \
Note that some of the classes in this framework, especially \
KStandardDirs, may not work correctly unless any libraries and other \
software using the KDE4 Support framework are installed to the same \
location as KDELibs4Support, although it may be sufficient to set the \
KDEDIRS environment variable correctly. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdelibs4support-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7f2bf0915dc58816fd9b5d9a5db433a81786f39cb9c092d4619ca95f1276df93d7cd93af3449db9bbee700e3cd0b0b2c6bc13a902062f735d62200c3ec62c6b4"

RPROVIDES:${PN} += "cmake(KF5KDE4Support) cmake(KF5KDELibs4Support) kde4support-devel kdelibs4support-devel kdelibs4support-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) cmake(KF5Auth) cmake(KF5ConfigWidgets) cmake(KF5CoreAddons) cmake(KF5Crash) cmake(KF5DBusAddons) cmake(KF5DesignerPlugin) cmake(KF5DocTools) cmake(KF5Emoticons) cmake(KF5GuiAddons) cmake(KF5IconThemes) cmake(KF5Init) cmake(KF5ItemModels) cmake(KF5Notifications) cmake(KF5Parts) cmake(KF5TextWidgets) cmake(KF5UnitConversion) cmake(KF5WindowSystem) cmake(Qt5Core) cmake(Qt5DBus) cmake(Qt5PrintSupport) cmake(Qt5Xml) extra-cmake-modules kdelibs4support libKF5KDELibs4Support5"

inherit rpm
