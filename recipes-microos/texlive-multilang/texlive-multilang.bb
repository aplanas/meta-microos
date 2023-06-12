SUMMARY = "A LaTeX package for maintaining multiple translations of a document"
DESCRIPTION = "Maintaining a LaTeX document with translations for multiple \
languages can be cumbersome and error-prone. This package \
provides a set of macros for defining macros and environments \
as wrappers around existing macros and environments. These \
wrappers allow one to clearly specify multiple translations for \
the arguments to the wrapped macros and environments while only \
the translation of the document's language is actually shown. \
Choosing a translation then is as simple as choosing the \
document's language via babel or polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9bsvn49065"

RPM_NAME = "texlive-multilang-2023.201.0.0.9bsvn49065-54.1.noarch.rpm"
RPM_HASH = "cbbc6ebb9c8c10091f1423edb435eaef18d860287431d03efd0e1ae016a5541c35c66e8e95cb1cee8e8b91530fcbf5b3b063d91c5fcbcc746e4e47516b39963a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multilang-sect.sty) \
tex(multilang-tags.sty) \
tex(multilang.sty) \
texlive-multilang"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(etoolbox.sty) \
tex(pgfkeys.sty) \
tex(pgfopts.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
