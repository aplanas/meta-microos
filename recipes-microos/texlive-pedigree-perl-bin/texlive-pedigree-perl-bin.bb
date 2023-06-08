SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2023.20230311.svn25962-89.1.aarch64.rpm"
RPM_HASH = "f67bba56037c0e6df9ae4929667d21d731fdff54b481aa9b17e6da1bb529e92c063c8c36948b21976f6741d4e4ad33d4ea3df4c260c41573f654108a76800cac"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin texlive-pedigree-perl-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
