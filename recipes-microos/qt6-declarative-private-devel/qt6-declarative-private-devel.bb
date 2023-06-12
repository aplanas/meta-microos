SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-private-devel-6.5.1-1.2.noarch.rpm"
RPM_HASH = "80f8cf3109da9720274ddfdb8a358bd42d727802f796fd95285872763a5575a409c7d4a16c906b4a149a259f083000bc5d71e797821ef18f1827d7e890d4f3b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-private-devel"
RDEPENDS:${PN} += "qt6-qml-private-devel \
qt6-qmlcore-private-devel \
qt6-qmllocalstorage-private-devel \
qt6-qmlmodels-private-devel \
qt6-qmlworkerscript-private-devel \
qt6-quick-private-devel \
qt6-quickcontrols2-private-devel \
qt6-quickcontrols2impl-private-devel \
qt6-quickdialogs2-private-devel \
qt6-quickdialogs2quickimpl-private-devel \
qt6-quickdialogs2utils-private-devel \
qt6-quicklayouts-private-devel \
qt6-quickparticles-private-devel \
qt6-quickshapes-private-devel \
qt6-quicktemplates2-private-devel \
qt6-quicktest-private-devel \
qt6-quickwidgets-private-devel"

inherit rpm
