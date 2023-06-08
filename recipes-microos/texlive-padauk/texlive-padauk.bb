SUMMARY = "A high-quality TrueType font that supports the many diverse languages that use the Myanmar script"
DESCRIPTION = "Padauk is a Unicode-based font family with broad support for \
writing systems that use the Myanmar script."
LICENSE = "OFL-1.1"

PV = "2023.201.3.002svn42617"

RPM_NAME = "texlive-padauk-2023.201.3.002svn42617-51.1.noarch.rpm"
RPM_HASH = "5f0d061611357555e41720ba291201daec0b5027fe359b9f160694b982232b1d155ae8fea11e594766fc19115c2789c17f4b8462ec2be5d1ff4547d2012af9c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-padauk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-padauk-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
