SUMMARY = "Plasma 5 theme for openSUSE"
DESCRIPTION = "This package contains the Plasma 5 Look-and-feel package for openSUSE."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "84.87~git20230131T131056~433af24"

RPM_NAME = "plasma5-theme-openSUSE-84.87~git20230131T131056~433af24-6.1.noarch.rpm"
RPM_HASH = "e3d674ed36fa64cfd9a5e24a500ee3937964b2c94afa0ed321b64e064685722d348907367b5b76c11dbbf9d318510cb392af7cf133127e67b5e8521b568fa814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plasma5-desktop-branding-openSUSE plasma5-theme-openSUSE"
RDEPENDS:${PN} += "/bin/sh coreutils qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.VirtualKeyboard.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kcoreaddons.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kwin.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.private.sessions.2) qt5qmlimport(org.kde.plasma.workspace.components.2) qt5qmlimport(org.kde.plasma.workspace.keyboardlayout.1) wallpaper-branding-openSUSE"

inherit rpm
