SUMMARY = "Basic development packages for TeXLive"
DESCRIPTION = "This package will cause the installation of several \
development packages for TeXLive."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & SUSE-TeX"

PV = "2023.208"

RPM_NAME = "texlive-devel-2023.208-58.1.noarch.rpm"
RPM_HASH = "82d0c5c7e6bea1421f5114b99b11f29d22d830de7eb2e3d1c32db83d86ff89d3000fea0be65c4bae6b86ed7c0495df2bd4d2acc19476ed0fcdc5dc72da888aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-devel"
RDEPENDS:${PN} += "texlive-bin-devel texlive-cweb texlive-kpathsea-devel texlive-ptexenc-devel texlive-synctex-devel texlive-texlua-devel texlive-web"

inherit rpm
