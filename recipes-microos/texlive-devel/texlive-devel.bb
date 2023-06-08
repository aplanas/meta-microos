SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.201"

RPM_NAME = "texlive-devel-2023.201-56.1.noarch.rpm"
RPM_HASH = "3641b13d03c25142304f09c7374ee530515c2cd04ed77a081c7f75ac4fe9ad1f779ad09d8392494ebfd07ef5ffbef55945e8976ed6dd046a3a3438d53c9d86bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-devel"
RDEPENDS:${PN} += "texlive-bin-devel texlive-cweb texlive-kpathsea-devel texlive-ptexenc-devel texlive-synctex-devel texlive-texlua-devel texlive-web"

inherit rpm
