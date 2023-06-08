SUMMARY = "Configuration files for xmltex and pdfxmltex"
DESCRIPTION = "The xmltexconfig package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45845"

RPM_NAME = "texlive-xmltexconfig-2023.201.svn45845-52.1.noarch.rpm"
RPM_HASH = "697a23eb6f68d7c2db65b975a109059551992677fc09d5fad82d49b8e18693ef6021a7aaa6e2776ee1ad2d28aede7565b68f526c12c1fb4664e624b866e8afb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmltexconfig"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
