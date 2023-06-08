SUMMARY = "Binary files of findhyph"
DESCRIPTION = "Binary files of findhyph"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14758"

RPM_NAME = "texlive-findhyph-bin-2023.20230311.svn14758-89.1.aarch64.rpm"
RPM_HASH = "b3e10884e702963b3bd3486f4e39464f10eaf3f7641973475c9735279221450f24345d99f397a40bfe6a772b517de23201d50287439cfd515c6b7a527d74cc3c"

RPROVIDES:${PN} += "texlive-findhyph-bin texlive-findhyph-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-findhyph"

inherit rpm
