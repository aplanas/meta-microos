SUMMARY = "Permit footnotes in tables"
DESCRIPTION = "The package provides the command \\tablefootnote to be used in a \
table or sidewaystable environment, where \\footnote will not \
work (and when using \\footnotemark and \\footnotetext, and \
adjusting the counter as necessary, is too much work)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1csvn32804"

RPM_NAME = "texlive-tablefootnote-2023.201.1.1csvn32804-57.1.noarch.rpm"
RPM_HASH = "c1e7090b36d28c0c3ff8ce78388feed52911f916177710147421ff0a717db147c317e2bf8d525bde735cbecf652e825fb899a3fffb7c733e9f0a3785a0fc2652"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tablefootnote.sty) texlive-tablefootnote"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(letltxmacro.sty) tex(ltxcmds.sty) tex(xifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
