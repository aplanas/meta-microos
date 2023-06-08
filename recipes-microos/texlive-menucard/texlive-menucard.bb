SUMMARY = "Typesetting menu cards with LaTeX"
DESCRIPTION = "This LaTeX package can be used for typesetting simple \
restaurant menus."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55643"

RPM_NAME = "texlive-menucard-2023.201.0.0.1svn55643-54.1.noarch.rpm"
RPM_HASH = "6e0eb7b49086cf08a6be0f4cbea321955bd1cf3c6c2c201a30c79046379170c36ee4e76b6022154f83aea721bd5d4997cde526b8c8d437292ffc80d09f4572d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(menucard.sty) texlive-menucard"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(soul.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
