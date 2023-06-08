SUMMARY = "Russian introduction to LaTeX"
DESCRIPTION = "Russian version of A Short Introduction to LaTeX2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn55643"

RPM_NAME = "texlive-lshort-russian-2023.201.svn55643-54.1.noarch.rpm"
RPM_HASH = "1aa29832f1117cef8c2539ef8742ce0fec83d9fb1749390f51ab3bd411560706ddc1ed19245d84f7d71faad1d7c9a941010821573b760014779c2b1bbad87cc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-russian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
