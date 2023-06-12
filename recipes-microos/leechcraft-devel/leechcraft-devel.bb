SUMMARY = "LeechCraft Development Files"
DESCRIPTION = "This package provides files required for development of \
new LeechCraft modules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-devel-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "2a5399892e95f6f012f4f3a43a4758bc78745f471c1cb679ce3626ad2f19a75404974d2bd8086e301ad8f325d90263c01ba76ce3ea5c3dbb1ca2e7143119d318"

RPROVIDES:${PN} += "leechcraft-devel \
leechcraft-devel(aarch-64)"
RDEPENDS:${PN} += "cmake \
leechcraft \
libQt5Gui-private-headers-devel \
libleechcraft-util-db-qt5-0_6_75_1 \
libleechcraft-util-gui-qt5-0_6_75_1 \
libleechcraft-util-models-qt5-0_6_75_1 \
libleechcraft-util-network-qt5-0_6_75_1 \
libleechcraft-util-qml-qt5-0_6_75_2 \
libleechcraft-util-shortcuts-qt5-0_6_75 \
libleechcraft-util-sll-qt5-0_6_75_1 \
libleechcraft-util-svcauth-qt5-0_6_75 \
libleechcraft-util-sys-qt5-0_6_75_1 \
libleechcraft-util-tags-qt5-0_6_75_1 \
libleechcraft-util-x11-qt5-0_6_75 \
libleechcraft-util-xdg-qt5-0_6_75 \
libleechcraft-util-xpc-qt5-0_6_75_2 \
libleechcraft-util-xsd-qt5-0_6_75 \
libqt5-linguist-devel \
pkgconfig(Qt5Concurrent) \
pkgconfig(Qt5DBus) \
pkgconfig(Qt5OpenGL) \
pkgconfig(Qt5PrintSupport) \
pkgconfig(Qt5Script) \
pkgconfig(Qt5Svg) \
pkgconfig(Qt5X11Extras) \
pkgconfig(Qt5XmlPatterns)"

inherit rpm
