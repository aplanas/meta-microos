SUMMARY = "SDDM theme for openSUSE"
DESCRIPTION = "This package contains a version of the Breeze SDDM theme customized \
for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "sddm-theme-openSUSE-84.87~git20230131T131056~433af24-7.1.noarch.rpm"
RPM_HASH = "a0d610e19483ac86f1d021a54ed54faec1953ab736a565727745a3593b8d77557c7bf299d7f0cd75de91b711ade9d6fc0ec7dce6eaeca286ac6254d0c57eff0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sddm-theme-openSUSE"
RDEPENDS:${PN} += "libqt5-qtquickcontrols plasma-framework-components plasma5-workspace qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.VirtualKeyboard.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.private.sessions.2) qt5qmlimport(org.kde.plasma.workspace.components.2) qt5qmlimport(org.kde.plasma.workspace.keyboardlayout.1) wallpaper-branding-openSUSE"

inherit rpm
