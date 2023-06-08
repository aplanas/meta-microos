SUMMARY = "Invoke bash commands from within LaTeX"
DESCRIPTION = "The package makes it possible to execute Unix bash shell \
scripts from within LaTeX. The main application is in writing \
computer-science texts, in which you want to make sure the \
programs listed in the document are executed directly from the \
input. The package may use other Unix shells than bash, but \
does not work without modification in a Windows environment. \
The package requires the -shell-escape flag when LaTeX is \
processing your document."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn25597"

RPM_NAME = "texlive-bashful-2023.201.0.0.93svn25597-53.1.noarch.rpm"
RPM_HASH = "d0541f884a1d43435451b807b8bef115fdcbfaaf8900b87b35760a3b85befa90333a0b65696fc42df2b7b32f7f3ac88fc8eb2658e8a349f1471215d13a7e035f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bashful.sty) texlive-bashful"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(catchfile.sty) tex(listings.sty) tex(textcomp.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
