SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14758"

RPM_NAME = "texlive-findhyph-bin-2023.20230311.svn14758-91.1.aarch64.rpm"
RPM_HASH = "a764eb84a226227f1e8c9588e5d5349c4fdbc125980990e1edde5d52f2eceaf22244bf868440c88f06c285b149450cccf9b72919bf4542dabf9aa95eb6c9a19d"

RPROVIDES:${PN} += "texlive-findhyph-bin \
texlive-findhyph-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
