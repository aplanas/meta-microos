SUMMARY = "A short tutorial on using tlmgr in Chinese"
DESCRIPTION = "This is a Chinese translation of the tlmgr documentation. It \
introduces some of the common usage of the TeX Live Manager. \
The original can be found in the tlmgrbasics package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn59100"

RPM_NAME = "texlive-tlmgr-intro-zh-cn-2023.201.svn59100-52.1.noarch.rpm"
RPM_HASH = "bc4d6f2534b9439a04e5466c5b94461a8a113300f74d0a058ecea9c8a9675e61267afec7ce282b3e486b6d648b332e5334ad2eb534ea6293af6c3e890578b0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlmgr-intro-zh-cn"
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
