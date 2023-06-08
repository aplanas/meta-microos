SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-declarative-private-devel-6.5.0-2.1.noarch.rpm"
RPM_HASH = "f4fedc3b6589ee83ceabc2ab15e9a4832ceef85781d7cc127c2e0b409101a2ce5fc478d0720972614a2cc6945e622ceaa729ed2d12cfe5c2c31e440825ec1fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-private-devel"
RDEPENDS:${PN} += "qt6-qml-private-devel qt6-qmlcore-private-devel qt6-qmllocalstorage-private-devel qt6-qmlmodels-private-devel qt6-qmlworkerscript-private-devel qt6-quick-private-devel qt6-quickcontrols2-private-devel qt6-quickcontrols2impl-private-devel qt6-quickdialogs2-private-devel qt6-quickdialogs2quickimpl-private-devel qt6-quickdialogs2utils-private-devel qt6-quicklayouts-private-devel qt6-quickparticles-private-devel qt6-quickshapes-private-devel qt6-quicktemplates2-private-devel qt6-quicktest-private-devel qt6-quickwidgets-private-devel"

inherit rpm
