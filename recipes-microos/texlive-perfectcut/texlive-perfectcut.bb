SUMMARY = "Nested delimiters that consistently grow regardless of the contents"
DESCRIPTION = "This package defines the command \\perfectcut#1#2 which displays \
a bracket <#1||#2>. Various other delimiters are similarly \
defined (parentheses, square brackets ...). The effect of these \
commands is to let the delimiters grow according to the number \
of nested \\perfectcommands (regardless of the size of the \
contents). The package was originally intended for solving a \
notational issue for direct-style continuation calculi in proof \
theory. For general use, the package also defines commands for \
defining other sorts of delimiters which will behave in the \
same way (see example in the documentation). The package also \
offers a robust reimplementation of \\big, \\bigg, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn54080"

RPM_NAME = "texlive-perfectcut-2023.201.2.3svn54080-51.1.noarch.rpm"
RPM_HASH = "dc49ff2696aaccc5b50019fe566fee7cb56f96487dd60d8e08a764131eb93443d0a69cc38cd16ed430a1db5becde67744b10dc0ffe5dc32ba8661b994a4946d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(perfectcut.sty) texlive-perfectcut"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(graphicx.sty) tex(mathstyle.sty) tex(scalerel.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
