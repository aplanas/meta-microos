SUMMARY = "Logos for The Hague University of Applied Sciences (THUAS)"
DESCRIPTION = "This package contains some logos of The Hague University of \
Applied Sciences (THUAS). These Logos are available in English \
and in Dutch. They are rendered via PGF."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn51347"

RPM_NAME = "texlive-thuaslogos-2023.201.1.2svn51347-54.1.noarch.rpm"
RPM_HASH = "31f798b8036731585a3bd692e96c1e7565eb3fe297c07e7fa5e7297ebe4db12d91b831345c0299efa6c5a5cebe6e681bcd86ac380eccead7c4e98009a95ec091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thuaslogos.sty) texlive-thuaslogos"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pgf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
