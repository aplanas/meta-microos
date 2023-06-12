SUMMARY = "The KDE Plasma Workspace Components"
DESCRIPTION = "This package contains the basic packages for a Plasma workspace."
LICENSE = "GPL-2.0-only"

PV = "5.27.5"

RPM_NAME = "plasma5-desktop-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "0f7c50604bdaa5cdea3490bfc33ff680c595b24645af5aca49b15cdfc4d2458d05c50e31224da764cc7e0c7f9f3a23fd4aa50d7714ef0ad915743ba4233e9102"

RPROVIDES:${PN} += "application() application(kcm_access.desktop) application(kcm_activities.desktop) application(kcm_baloofile.desktop) application(kcm_clock.desktop) application(kcm_componentchooser.desktop) application(kcm_desktoppaths.desktop) application(kcm_joystick.desktop) application(kcm_kded.desktop) application(kcm_keyboard.desktop) application(kcm_keys.desktop) application(kcm_krunnersettings.desktop) application(kcm_landingpage.desktop) application(kcm_mouse.desktop) application(kcm_plasmasearch.desktop) application(kcm_qtquicksettings.desktop) application(kcm_recentFiles.desktop) application(kcm_smserver.desktop) application(kcm_solid_actions.desktop) application(kcm_splashscreen.desktop) application(kcm_tablet.desktop) application(kcm_touchpad.desktop) application(kcm_touchscreen.desktop) application(kcm_workspace.desktop) application(kcmspellchecking.desktop) application(org.kde.knetattach.desktop) kcm-touchpad kcm-touchpad5 kdebase4-workspace kdebase4-workspace-plasma-calendar kdebase4-workspace-plasma-engine-akonadi libEmojierDeclarativePlugin.so()(64bit) libactivityswitcherextensionplugin.so()(64bit) libdesktopplugin.so()(64bit) libfolderplugin.so()(64bit) libkactivitiessettingsplugin.so()(64bit) libkimpanelplugin.so()(64bit) libpagerplugin.so()(64bit) libshowdesktopplugin.so()(64bit) libtaskmanagerplugin.so()(64bit) libtrashplugin.so()(64bit) metainfo() metainfo(org.kde.desktopcontainment.appdata.xml) metainfo(org.kde.desktoptoolbox.appdata.xml) metainfo(org.kde.paneltoolbox.appdata.xml) metainfo(org.kde.plasma.activitypager.appdata.xml) metainfo(org.kde.plasma.desktop.appdata.xml) metainfo(org.kde.plasma.desktop.appmenubar.appdata.xml) metainfo(org.kde.plasma.desktop.defaultPanel.appdata.xml) metainfo(org.kde.plasma.desktop.emptyPanel.appdata.xml) metainfo(org.kde.plasma.folder.appdata.xml) metainfo(org.kde.plasma.icontasks.appdata.xml) metainfo(org.kde.plasma.keyboardlayout.appdata.xml) metainfo(org.kde.plasma.kicker.appdata.xml) metainfo(org.kde.plasma.kickoff.appdata.xml) metainfo(org.kde.plasma.kimpanel.appdata.xml) metainfo(org.kde.plasma.marginsseparator.appdata.xml) metainfo(org.kde.plasma.minimizeall.appdata.xml) metainfo(org.kde.plasma.pager.appdata.xml) metainfo(org.kde.plasma.showActivityManager.appdata.xml) metainfo(org.kde.plasma.showdesktop.appdata.xml) metainfo(org.kde.plasma.taskmanager.appdata.xml) metainfo(org.kde.plasma.trash.appdata.xml) metainfo(org.kde.plasma.windowlist.appdata.xml) metainfo(org.kde.plasmashell.metainfo.xml) plasma5-addons-kimpanel plasma5-desktop plasma5-desktop(aarch-64) plasma5-desktop-branding plasma5-desktop-branding-upstream plasma5-desktop-kimpanel qt5qmlimport(org.kde.activities.settings.0) qt5qmlimport(org.kde.plasma.activityswitcher.1) qt5qmlimport(org.kde.plasma.emoji.1) qt5qmlimport(org.kde.plasma.private.kimpanel.0) qt5qmlimport(org.kde.plasma.private.pager.2) qt5qmlimport(org.kde.plasma.private.showdesktop.0) qt5qmlimport(org.kde.plasma.private.taskmanager.0) qt5qmlimport(org.kde.plasma.private.trash.1) qt5qmlimport(org.kde.private.desktopcontainment.desktop.0) qt5qmlimport(org.kde.private.desktopcontainment.folder.0)"
RDEPENDS:${PN} += "/sbin/ldconfig /usr/bin/awk /usr/bin/env /usr/bin/python3 kactivities5-imports kinfocenter5 kirigami2 kmenuedit5 knewstuff-imports ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Activities.so.5()(64bit) libKF5ActivitiesStats.so.1()(64bit) libKF5AuthCore.so.5()(64bit) libKF5Baloo.so.5()(64bit) libKF5Bookmarks.so.5()(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KCMUtilsCore.so.5()(64bit) libKF5KDELibs4Support.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5KIOGui.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5NotifyConfig.so.5()(64bit) libKF5Package.so.5()(64bit) libKF5Plasma.so.5()(64bit) libKF5PlasmaQuick.so.5()(64bit) libKF5QuickAddons.so.5()(64bit) libKF5Runner.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5Solid.so.5()(64bit) libKF5SonnetCore.so.5()(64bit) libKF5SonnetUi.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Concurrent.so.5()(64bit) libQt5Concurrent.so.5(Qt_5)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5QuickWidgets.so.5()(64bit) libQt5QuickWidgets.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5WaylandClient.so.5()(64bit) libQt5WaylandClient.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libX11-xcb.so.1()(64bit) libX11.so.6()(64bit) libXcursor.so.1()(64bit) libXi.so.6()(64bit) libaccounts-qt5.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libibus-1.0.so.5()(64bit) libkaccounts.so.2()(64bit) libksysguard5-imports libkworkspace5.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnotificationmanager.so.1()(64bit) libpackagekitqt5.so.1()(64bit) libphonon4qt5.so.4()(64bit) libprocesscore.so.9()(64bit) libqt5-qtgraphicaleffects libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtaskmanager.so.6()(64bit) libwayland-client.so.0()(64bit) libxcb-keysyms.so.1()(64bit) libxcb-record.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbfile.so.1()(64bit) plasma-framework-components plasma5-workspace qt5qmlimport(Qt.labs.platform.1) qt5qmlimport(QtGraphicalEffects.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.1) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Dialogs.1) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Templates.2) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(org.kde.activities.0) qt5qmlimport(org.kde.activities.settings.0) qt5qmlimport(org.kde.baloo.experimental.0) qt5qmlimport(org.kde.draganddrop.2) qt5qmlimport(org.kde.kcm.1) qt5qmlimport(org.kde.kcmutils.1) qt5qmlimport(org.kde.kconfig.1) qt5qmlimport(org.kde.kcoreaddons.1) qt5qmlimport(org.kde.kirigami.2) qt5qmlimport(org.kde.kitemmodels.1) qt5qmlimport(org.kde.kquickcontrols.2) qt5qmlimport(org.kde.kquickcontrolsaddons.2) qt5qmlimport(org.kde.kwindowsystem.1) qt5qmlimport(org.kde.newstuff.1) qt5qmlimport(org.kde.pipewire.0) qt5qmlimport(org.kde.plasma.activityswitcher.1) qt5qmlimport(org.kde.plasma.components.2) qt5qmlimport(org.kde.plasma.components.3) qt5qmlimport(org.kde.plasma.configuration.2) qt5qmlimport(org.kde.plasma.core.2) qt5qmlimport(org.kde.plasma.extras.2) qt5qmlimport(org.kde.plasma.plasmoid.2) qt5qmlimport(org.kde.plasma.private.containmentlayoutmanager.1) qt5qmlimport(org.kde.plasma.private.kicker.0) qt5qmlimport(org.kde.plasma.private.kimpanel.0) qt5qmlimport(org.kde.plasma.private.pager.2) qt5qmlimport(org.kde.plasma.private.shell.2) qt5qmlimport(org.kde.plasma.private.showdesktop.0) qt5qmlimport(org.kde.plasma.private.taskmanager.0) qt5qmlimport(org.kde.plasma.private.trash.1) qt5qmlimport(org.kde.plasma.shell.2) qt5qmlimport(org.kde.plasma.workspace.components.2) qt5qmlimport(org.kde.plasma.workspace.keyboardlayout.1) qt5qmlimport(org.kde.plasma.workspace.trianglemousefilter.1) qt5qmlimport(org.kde.private.desktopcontainment.desktop.0) qt5qmlimport(org.kde.private.desktopcontainment.folder.0) qt5qmlimport(org.kde.taskmanager.0) signon-plugin-oauth2"

inherit rpm
