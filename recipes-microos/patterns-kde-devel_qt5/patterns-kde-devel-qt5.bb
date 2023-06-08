SUMMARY = "Qt 5 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 5."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-devel_qt5-20230403-1.1.noarch.rpm"
RPM_HASH = "319710b3c127530aee30aa093e9018eb915e1aeddae956eb9ef1c757a43da4837c7cb1b9bd048640de760e1f3e32f33ee00643034df065b1a97f08dc057102f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-kde-devel_qt5 patterns-openSUSE-devel_qt5"
RDEPENDS:${PN} += "libqt5-qtbase-common-devel pattern()"

inherit rpm
