SUMMARY = "Accept CSS-like selectors in tabular, array,"
DESCRIPTION = "This package reworks the internals of tabular, array, and \
similar constructs, and adds a \\cellprops command accepting \
CSS-like selectors and properties. It depends on mdwtab, \
xcolor, expl3, and xparse."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn57599"

RPM_NAME = "texlive-cellprops-2023.201.2.0svn57599-52.1.noarch.rpm"
RPM_HASH = "305101d37e26b310979c7acadb4b21180ace3d799a7c11da8b6c3ebf819ee37d069ed011a3fbf5626562ba57a409fd5a6a3c6a9d4f8eee0e21cf9c4057b00d12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cellprops.sty) texlive-cellprops"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expl3.sty) tex(mdwtab.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
