SUMMARY = "LaTeX package for the English raised decimal point"
DESCRIPTION = "This LaTeX package should be used by people who need the \
traditional English raised decimal point, instead of the \
American-style period."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23374"

RPM_NAME = "texlive-decimal-2023.201.svn23374-52.1.noarch.rpm"
RPM_HASH = "61d647d49a01acc9a062ad96cc64952d7033415290f3b30b0d6891dc0fa989968ed39cc8e7e33b1c5c3ff359663224e847591cf062a164d76189025c859f6ba4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(decimal.sty) texlive-decimal"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
