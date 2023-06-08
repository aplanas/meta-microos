SUMMARY = "Documentation for texlive-babel-dutch"
DESCRIPTION = "This package includes the documentation for texlive-babel-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.8lsvn60362"

RPM_NAME = "texlive-babel-dutch-doc-2023.201.3.8lsvn60362-53.1.noarch.rpm"
RPM_HASH = "fe509af1b82d0f953bbae9ede4e7ddd5147097465ad986cedf8f58adc0807fae63b2af3938e1d6d55778f2f0157d4e8b2682979e7b07a86dadd8ffdbfdb2c2cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-dutch-doc"
RDEPENDS:${PN} += ""

inherit rpm
