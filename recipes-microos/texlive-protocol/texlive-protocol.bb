SUMMARY = "A class for minutes of meetings"
DESCRIPTION = "The present version of the class supports German meeting \
minutes including vote results and action items. The author has \
ambitions to internationalise the code, and would welcome \
support in the work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn25562"

RPM_NAME = "texlive-protocol-2023.201.1.13svn25562-52.1.noarch.rpm"
RPM_HASH = "edccbfa576b9604da95466ceae51276adb7e7c770adad0725eb55376c7e9a1abed8a9450a4ed5b74d497283c4f7c546f811caf70d9303857953d3c92618c3bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(protocol.cls) \
texlive-protocol"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(scrartcl.cls) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
