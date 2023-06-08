SUMMARY = "Documentation for texlive-wallpaper"
DESCRIPTION = "This package includes the documentation for texlive-wallpaper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-wallpaper-doc-2023.201.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "182b4daa7cd31ffd8f862f84f68e8cb85553c8694013564dc65a4a4c7c355f23730313c2ab5dbfac9e94e0e5a2fced940ded649a834f09fd792d6b7fad1d836d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wallpaper-doc"
RDEPENDS:${PN} += ""

inherit rpm
