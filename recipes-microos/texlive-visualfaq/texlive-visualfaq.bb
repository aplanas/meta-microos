SUMMARY = "A Visual LaTeX FAQ"
DESCRIPTION = "Having trouble finding the answer to a LaTeX question? The \
Visual LaTeX FAQ is an innovative new search interface that \
presents over a hundred typeset samples of frequently requested \
document formatting. Simply click on a hyperlinked piece of \
text and the Visual LaTeX FAQ will send your Web browser to the \
appropriate page in the TeX FAQ."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-visualfaq-2023.201.svn61719-53.1.noarch.rpm"
RPM_HASH = "3049dc12597e92dd937dc156b95bde50497eea49432f5c108aafcfbbabcad7869f1f4fb60323f4d88879dac7ff1b30bdb9969ce24eeac14eaa52c7863ad2dfdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
