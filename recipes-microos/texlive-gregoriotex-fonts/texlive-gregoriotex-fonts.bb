SUMMARY = "Severed fonts for texlive-gregoriotex"
DESCRIPTION = "The  separated fonts package for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-fonts-2023.201.6.0.0svn58331-53.1.noarch.rpm"
RPM_HASH = "560181d789b8f0eaebbff3defa2266ef4c95a8fd67cefa0c63b6c3e27690ae1a5d25db01fbefc72a2c2519ee4e537f693af4d79d0c3be29a642bebdfa10a2756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(greciliae) font(greciliae-hole) font(greciliae-hollow) font(greciliae-op) font(greciliae-op-hole) font(greciliae-op-hollow) font(greextra) font(gregall) font(grelaon) font(gresgmodern) texlive-gregoriotex-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
