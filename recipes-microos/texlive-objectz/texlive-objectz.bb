SUMMARY = "Macros for typesetting Object Z"
DESCRIPTION = "The package will typeset both Z and Object-Z specifications; it \
develops the original zed package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-objectz-2023.201.svn61719-54.1.noarch.rpm"
RPM_HASH = "764a186a0c59b6ce954fdfa8d18bde8c44596f03ce15a1954b8cc84de24f5d581ecb982182f1c216a5effb7bd8884a997dfae8e10a5557bfd0dc6f389fd8ba1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(oz.sty) texlive-objectz"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
