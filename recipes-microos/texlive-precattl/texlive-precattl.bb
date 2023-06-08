SUMMARY = "Prepare special catcodes from token list"
DESCRIPTION = "Allow users to write code that contains tokens with unusual \
catcodes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63967"

RPM_NAME = "texlive-precattl-2023.201.0.0.0.0svn63967-52.1.noarch.rpm"
RPM_HASH = "bc3c180793b0b284c8c9180e4644712cf310ff19a229d1d92252c8d308a30a6df9ee9b717e35dc8b950417bd800519f6cffd34ff99ea81764870c73f5c013e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(precattl.sty) texlive-precattl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
