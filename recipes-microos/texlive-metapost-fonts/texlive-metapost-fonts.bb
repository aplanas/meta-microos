SUMMARY = "Severed fonts for texlive-metapost"
DESCRIPTION = "The  separated fonts package for texlive-metapost"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn66264"

RPM_NAME = "texlive-metapost-fonts-2023.201.svn66264-54.1.noarch.rpm"
RPM_HASH = "b65917dc3cee31403263bc9c68085d67f7f941b2f7e12885dbd4687f657e908c9febc49fbe9440c85671dde6a532259cd8c83da9a31c49ee27b869736d67086f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(freeeuro) texlive-metapost-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
