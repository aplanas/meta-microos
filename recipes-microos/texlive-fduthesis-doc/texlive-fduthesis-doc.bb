SUMMARY = "Documentation for texlive-fduthesis"
DESCRIPTION = "This package includes the documentation for texlive-fduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn66188"

RPM_NAME = "texlive-fduthesis-doc-2023.201.0.0.9svn66188-52.1.noarch.rpm"
RPM_HASH = "fe6ceb05ab1147280f2bbcfdd9b273e7a570f9060fc587e402f7db21bbea7daf91d3e9fe1593afdb42022912453dfefda89a664be84008f0ef9d4eb3456909ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-fduthesis-doc:zh;en) texlive-fduthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
