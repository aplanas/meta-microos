SUMMARY = "Qt 6 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 6."
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-devel_qt6-20230403-1.1.noarch.rpm"
RPM_HASH = "2f003ea947f66e787d680a3614b723702200afc557eb0f30e4c562594a36cd7b9e320fa4f1bfd8c6da8303ed2acc2c3e56f6960e094c8adadf5782ab76fc6214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-kde-devel_qt6 patterns-openSUSE-devel_qt6"
RDEPENDS:${PN} += "pattern() qt6-base-common-devel"

inherit rpm
