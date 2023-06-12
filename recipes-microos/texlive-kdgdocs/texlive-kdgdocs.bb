SUMMARY = "Document classes for Karel de Grote University College"
DESCRIPTION = "The bundle provides two classes for usage by KdG professors and \
master students: kdgcoursetext: for writing course texts, and \
kdgmasterthesis: for writing master's theses. The bundle \
replaces the original kdgcoursetext package (now removed from \
the archive)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-2023.201.1.0svn24498-55.1.noarch.rpm"
RPM_HASH = "bf421d7f7f93368561c6197dff2e560b5844fdb95ff002f65e61524049b1e836e71b54fc925510cac4c1bb77360c37e35b25f10cdb6d46817cb5c7ea2b0c16af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(kdgcoursetext.cls) \
tex(kdgmasterthesis.cls) \
texlive-kdgdocs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(cmbright.sty) \
tex(color.sty) \
tex(eso-pic.sty) \
tex(fancyhdr.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifthen.sty) \
tex(ifxetex.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
