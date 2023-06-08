SUMMARY = "SDDM theme for openSUSE"
DESCRIPTION = "This package contains a version of the Breeze SDDM theme customized \
for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "sddm-theme-openSUSE-84.87~git20230131T131056~433af24-6.1.noarch.rpm"
RPM_HASH = "24ec88bf4436dc62c7f11d4a6b1956dff5580c257070f3309ee17ba20e300cfd17c32b385cfeb997a7f68c1c7e6b45b2f430c3d647e359742e53b831babb2a75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-theme-openSUSE"
RDEPENDS:${PN} += "libqt5-qtquickcontrols plasma-framework-components plasma5-workspace qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.VirtualKeyboard.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.private.sessions.2) qt5qmlimport(org.kde.plasma.workspace.components.2) qt5qmlimport(org.kde.plasma.workspace.keyboardlayout.1) wallpaper-branding-openSUSE"

inherit rpm
