SUMMARY = "Severed fonts for texlive-ascmac"
DESCRIPTION = "The  separated fonts package for texlive-ascmac"
LICENSE = "BSD-3-Clause"

PV = "2023.201.2.1svn53411"

RPM_NAME = "texlive-ascmac-fonts-2023.201.2.1svn53411-53.1.noarch.rpm"
RPM_HASH = "f93bfeb9aa5d212cf1f337b28a079d1eac114e08a4fc9416a76a6200e023a268a6c6c1a248cc87f3f102b265164ae775e80ab74a8b8aa49fe8d0141655cc8b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(tex\040ascgrp) \
font(tex\040ascii10) \
font(tex\040ascii36) \
texlive-ascmac-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
