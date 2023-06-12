SUMMARY = "Create circled text"
DESCRIPTION = "This LaTeX package provides a macro \\circledtext to typeset \
circled text. Its starred version can produce an inverted \
version."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn63166"

RPM_NAME = "texlive-circledtext-2023.201.1.1.0svn63166-53.1.noarch.rpm"
RPM_HASH = "da83a41d63699eb7bf5b5fe653add3434a375111418ea313dfd924e157843a24b9a2fa8aaaf4ddae76b0a7722e44665d79b8ab8b2b754720fa6cf19e612a889e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(circledtext.sty) \
texlive-circledtext"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(l3draw.sty) \
tex(l3keys2e.sty) \
tex(xparse.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
