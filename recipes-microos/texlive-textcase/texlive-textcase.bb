SUMMARY = "Case conversion ignoring mathematics, etcetera"
DESCRIPTION = "The textcase package offers commands \\MakeTextUppercase and \
\\MakeTextLowercase which are similar to the standard \
\\MakeUppercase and \\MakeLowercase, but they do not change the \
case of any sections of mathematics, or the arguments of \\cite, \
\\label and \\ref commands within the argument. A further command \
\\NoCaseChange does nothing but suppress case change within its \
argument, so to force uppercase of a section including an \
environment, one might say: \
\\MakeTextUppercase{...\\NoCaseChange{\\begin{foo}} \
...\\NoCaseChange{\\end{foo}}...} In current LaTeX this package \
is obsolete. You can use the standard \\MakeUppercase and \
\\MakeLowercase, but it defines legacy names \\MakeTextUppercase \
and \\MakeTextLowercase."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn63868"

RPM_NAME = "texlive-textcase-2023.201.1.03svn63868-54.1.noarch.rpm"
RPM_HASH = "669ca8592be77408bd6867cfb29d8a82c52136d5f6a8a6995e202e2807a2e44ce66a0a6b9d7db5614a5a21cf2de83ce85affbfc75108d0eb892f7f66fe87e4c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(textcase.sty) \
texlive-textcase"
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
