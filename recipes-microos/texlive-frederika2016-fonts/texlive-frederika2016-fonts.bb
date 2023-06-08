SUMMARY = "Severed fonts for texlive-frederika2016"
DESCRIPTION = "The  separated fonts package for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2023.201.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-fonts-2023.201.1.000_2016_initial_releasesvn42157-52.1.noarch.rpm"
RPM_HASH = "c8d9ae3df1ab0463469b9c5236700191b988772c3989b42b5d030feef580d0add8227959921509624150669c3f10b0d9c5d57061f813a2f1d83cf4d33a75304c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=el) font(frederika2016) texlive-frederika2016-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
