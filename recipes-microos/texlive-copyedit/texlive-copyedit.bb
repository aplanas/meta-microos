SUMMARY = "Copyediting support for LaTeX documents"
DESCRIPTION = "This package implements copyediting support for LaTeX \
documents. Authors can enjoy the freedom of using, for example, \
words with US or UK or Canadian or Australian spelling in a \
mixed way, yet, they can choose any one of the usage forms for \
their entire document irrespective of kinds of spelling they \
have adopted. In the same fashion, the users can have the \
benefit of the following features available in the package: \
Localization -- British-American-Australian-Canadian Close-up, \
Hyphenation, and Spaced words Latin abbreviations Acronyms and \
Abbreviations Itemization, nonlocal lists and labels \
Parenthetical and serial commas Non-local tokenization in \
language through Abbreviations and pronouns."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.6svn37928"

RPM_NAME = "texlive-copyedit-2023.204.1.6svn37928-54.1.noarch.rpm"
RPM_HASH = "7eb0eca9c0b5bdb3bc0268364c6be476c704957c96df67f351778d30f01400efb2c081c136202f2d42014603081c028efe4bb98508c9ad82136be7338caf651d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(copyedit.sty) \
texlive-copyedit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acronym.sty) \
tex(enumitem.sty) \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
