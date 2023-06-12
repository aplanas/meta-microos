SUMMARY = "MetaPost support for the Hershey font file format"
DESCRIPTION = "This package provides MetaPost support for reading jhf vector \
font files, used by (mostly? only?) the so-called Hershey Fonts \
of the late 1960s. The package does not include the actual font \
files, which you can probably find in the software repository \
of your operating system."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-2023.201.2022_1.0svn64878-53.1.noarch.rpm"
RPM_HASH = "b6dcad775e28dbd37a2d67cbaf8c7e5bbbc7344679476fdcd23a2373ea407d136224964372c0fd7f556e27be8f795df22d57034b107bc9b39b44bdb9143c8b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp"
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
