SUMMARY = "Polish-oriented document classes"
DESCRIPTION = "mwcls is a set of document classes for LaTeX 2e designed with \
Polish typographical tradition in mind. Classes include: \
'mwart' (which is a replacement for 'article'), 'mwrep' \
(replacing 'report'), and 'mwbk' (replacing 'book'). Most \
features present in standard classes work with mwcls classes. \
Some extensions/exceptions include: sectioning commands allow \
for second optional argument (it is possible to state different \
texts for running head and for TOC), new environments \
'itemize*' and 'enumerate*' for lists with long items, page \
styles have variants for normal, opening, closing, and blank \
pages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.75svn44352"

RPM_NAME = "texlive-mwcls-2023.201.0.0.75svn44352-54.1.noarch.rpm"
RPM_HASH = "a2898f77fba3f1cb11e179b14e05f646f27c0681b49113c5561fc34f47895298757b9b1b67d6719e98af09787eb003128d827eab9cb4c97e82b903cad0b20fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mw10.clo) \
tex(mw11.clo) \
tex(mw12.clo) \
tex(mwart.cls) \
tex(mwbk.cls) \
tex(mwbk10.clo) \
tex(mwbk11.clo) \
tex(mwbk12.clo) \
tex(mwrep.cls) \
texlive-mwcls"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
