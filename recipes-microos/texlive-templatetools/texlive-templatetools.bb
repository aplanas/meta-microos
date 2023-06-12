SUMMARY = "Commands useful in LaTeX templates"
DESCRIPTION = "The package provides a collection of tools, which are helpful \
for the creation of a LaTeX template if conditional paths for \
code execution are required. All the commands work both in the \
preamble and in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34495"

RPM_NAME = "texlive-templatetools-2023.201.svn34495-54.1.noarch.rpm"
RPM_HASH = "38ab879c1f3c7c1462e85f8382185e5f0d4c07e9bbc78043b1dfc096bcb13e5e5f02513c7c27d46ad18480dba8c489f5a5c16fcf9e7e9b0669db14f2f5d3b855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(templatetools.sty) \
texlive-templatetools"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(etoolbox.sty) \
tex(ifdraft.sty) \
tex(ifpdf.sty) \
tex(ltxcmds.sty) \
tex(scrlfile.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
