SUMMARY = "Use TikZ's method of remembering a position on a page"
DESCRIPTION = "The tikzmark package defines a command to 'remember' a position \
on a page for later (or earlier) use, primarily (but not \
exclusively) with TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn64819"

RPM_NAME = "texlive-tikzmark-2023.201.1.15svn64819-52.1.noarch.rpm"
RPM_HASH = "4bdcbf0f753534c53d10a433a6782d0f5b462a476a2e9e417e60ad0001c96a1afa966b727ce4bd06265a23e210a835bc9b32355eb3c51f0408281bc33b93362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikzlibrarytikzmark.code.tex) tex(tikzmarklibraryams.code.tex) tex(tikzmarklibraryhighlighting.code.tex) tex(tikzmarklibrarylistings.code.tex) texlive-tikzmark"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
