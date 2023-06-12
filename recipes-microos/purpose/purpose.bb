SUMMARY = "Framework to integrate services and actions in applications"
DESCRIPTION = "This framework offers the possibility to create integrate services and actions \
on any application without having to implement them specifically. Purpose will \
offer them mechanisms to list the different alternatives to execute given the \
requested action type and will facilitate components so that all the plugins \
can receive all the information they need."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "purpose-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c5565e8ee55d5980c207dbb7b11c4aa31a0f8d9ccb3669a4bd112f7eefb3ecd9805efd2a6db1af8a434bbb320314dad92500e58ddc8dc6cc29a4d2033cb0bd7d"

RPROVIDES:${PN} += "libPhabricatorHelpers.so.5()(64bit) \
libReviewboardHelpers.so.5()(64bit) \
libphabricatorquickplugin.so()(64bit) \
libpurposequickplugin.so()(64bit) \
librbpurposequickplugin.so()(64bit) \
purpose \
purpose(aarch-64) \
qt5qmlimport(org.kde.purpose.1) \
qt5qmlimport(org.kde.purpose.phabricator.1) \
qt5qmlimport(org.kde.purpose.reviewboard.1)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kdeclarative-components \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5Purpose.so.5()(64bit) \
libKF5PurposeWidgets.so.5()(64bit) \
libKF5QuickAddons5 \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libaccounts-qt5.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libkaccounts.so.2()(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Dialogs.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(org.kde.bluezqt.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.kquickcontrolsaddons.2) \
qt5qmlimport(org.kde.prison.1) \
qt5qmlimport(org.kde.purpose.1) \
qt5qmlimport(org.kde.purpose.phabricator.1) \
qt5qmlimport(org.kde.purpose.reviewboard.1)"

inherit rpm
