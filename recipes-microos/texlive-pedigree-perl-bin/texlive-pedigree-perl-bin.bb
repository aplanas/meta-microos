SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2023.20230311.svn25962-91.1.aarch64.rpm"
RPM_HASH = "881c15982d46687ecfd2c8d2b91013f3328023fec8eb73bbb13250ca3598ddb4b65c1b06355f6d35b916aca72da6fa74d6bed6b4848ffeb74bb9589ec326294c"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin \
texlive-pedigree-perl-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
