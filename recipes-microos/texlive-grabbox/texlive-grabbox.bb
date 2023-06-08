SUMMARY = "Read an argument into a box and execute the code afterwards"
DESCRIPTION = "The package provides the command \\grabbox, which grabs an \
argument into a box and executes the code afterwards."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65223"

RPM_NAME = "texlive-grabbox-2023.201.1.4svn65223-53.1.noarch.rpm"
RPM_HASH = "8c70b1eb048320a1cc4f942f111d6ea07251a3913448ca00502a78658271591729501cceb14f0c55d7f22d334edc1f8ae0401893e19e94910232ff83d21b57be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(grabbox.sty) texlive-grabbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
