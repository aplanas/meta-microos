SUMMARY = "Variants of common box-commands that read their content as real box and not as macro argument"
DESCRIPTION = "The package uses the author's package collectbox to define \
variants of common box related macros which read the content as \
real box and not as macro argument. This enables the use of \
verbatim or other special material as part of this content. The \
provided macros have the same names as the original versions \
but start with an upper-case letter instead. The 'long-form' \
macros, like \\Makebox, can also be used as environments, but \
not the 'short-form' macros, like \\Mbox. However, normally the \
long form uses the short form anyway when no optional arguments \
are used."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-2023.201.0.0.2svn64967-53.1.noarch.rpm"
RPM_HASH = "a650ff45f9ea403b7170193a2d9e75c63da1e514abf1a6f3f9145b7f476f7d1a73c583fb641800e4e8f2a7a6dede40fc5207a67ceebdd9d19dac34b91a59c176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(realboxes.sty) texlive-realboxes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjcalc.sty) tex(calc.sty) tex(collectbox.sty) tex(color.sty) tex(dashbox.sty) tex(fancybox.sty) tex(graphics.sty) tex(graphicx.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
