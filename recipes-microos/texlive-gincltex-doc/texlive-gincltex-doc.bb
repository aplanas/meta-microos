SUMMARY = "Documentation for texlive-gincltex"
DESCRIPTION = "This package includes the documentation for texlive-gincltex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64967"

RPM_NAME = "texlive-gincltex-doc-2023.201.0.0.3svn64967-52.1.noarch.rpm"
RPM_HASH = "9fb856e7745d8c48383074a020b28ccbda6b8b0cacdaf50416a8c70f292e8f31db21f76e47ff4dd94eeafcc1356324c227dba29c80a47a8aaf538533a3bfbb9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gincltex-doc"
RDEPENDS:${PN} += ""

inherit rpm
