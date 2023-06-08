SUMMARY = "Environment for vertical centring"
DESCRIPTION = "The environment will centre text, if immediately preceded and \
followed by \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn17484"

RPM_NAME = "texlive-midpage-2023.201.1.1asvn17484-54.1.noarch.rpm"
RPM_HASH = "2a4c556ababcdb2841c4a3c7fb1e84accb3997d7bb8f7f8307c5c88937380589bcc635701d1ea8bf1038e12f0903fb0beb350cfd8b65f666f4fc703abb3286f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(midpage.sty) texlive-midpage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
