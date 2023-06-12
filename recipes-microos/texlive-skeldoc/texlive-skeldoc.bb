SUMMARY = "Placeholders for unfinished documents"
DESCRIPTION = "This package lets you produce placeholder elements for \
documents under development, similar to the skeleton screens \
used while loading contents in many applications and websites. \
It also has a mechanism for attaching explanatory endnotes to \
these placeholders, or to anything else in your document. The \
same note mechanism can also be used with ordinary content, \
e.g., as a to-do mechanism."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn57922"

RPM_NAME = "texlive-skeldoc-2023.201.0.0.1.2svn57922-57.1.noarch.rpm"
RPM_HASH = "972170b4c898d82e3b4d212cb2effba1a291f20d52b17be8e1455fce1ded8182aa2be3fa6fb9db10ebd1f1f6e9d2d8d35027c7328d9992f49215991da853ffb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skeldoc.sty) \
texlive-skeldoc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(booktabs.sty) \
tex(enotez.sty) \
tex(enumitem.sty) \
tex(expl3.sty) \
tex(hyperref.sty) \
tex(marginnote.sty) \
tex(tabularx.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
