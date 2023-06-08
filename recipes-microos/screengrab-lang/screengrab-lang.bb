SUMMARY = "Translations for package screengrab"
DESCRIPTION = "Provides translations for the 'screengrab' package."
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "screengrab-lang-2.6.0-1.1.noarch.rpm"
RPM_HASH = "2c1257c23293361607d8f206f7998505bb9da346b493af608baa3f3c01cea93978e78dbc147ad9b1362d84728003d426260a3633840a085fddedab6460c4a5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "screengrab-lang screengrab-lang-all"
RDEPENDS:${PN} += "screengrab"

inherit rpm
