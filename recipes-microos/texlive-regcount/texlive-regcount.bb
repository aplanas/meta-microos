SUMMARY = "Display the allocation status of the TeX registers"
DESCRIPTION = "Adds a macro \\rgcounts which displays the allocation status of \
the TeX registers. The display is written into the .log file as \
it is a bit verbose. An automatic call to \\rgcounts is done at \
\\begin{document} and \\end{document}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn19979"

RPM_NAME = "texlive-regcount-2023.201.1.0svn19979-53.1.noarch.rpm"
RPM_HASH = "7461c5fcbfcad71b2eab0dd6442daf180dd2ee83f6e9867efb0dbdf9af165852fea3ddcfc0a8b6b39402fc7e7c8853509158604baae248fcdfa918aa7ac567d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(regcount.sty) texlive-regcount"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
