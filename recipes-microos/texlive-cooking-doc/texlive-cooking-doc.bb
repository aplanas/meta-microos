SUMMARY = "Documentation for texlive-cooking"
DESCRIPTION = "This package includes the documentation for texlive-cooking"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-doc-2023.204.0.0.9bsvn15878-54.1.noarch.rpm"
RPM_HASH = "4eaa30144e2d871b95dc207395addaf5b9d1595d84bbbd828661c60508eb7b873120fc73211ab97914942420adb84e949dfd4ef8d089d76e34c2d56752e28e7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-doc"
RDEPENDS:${PN} += ""

inherit rpm
