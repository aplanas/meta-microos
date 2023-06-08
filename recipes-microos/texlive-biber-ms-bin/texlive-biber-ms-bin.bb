SUMMARY = "Binary files of biber-ms"
DESCRIPTION = "Binary files of biber-ms"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66478"

RPM_NAME = "texlive-biber-ms-bin-2023.20230311.svn66478-89.1.noarch.rpm"
RPM_HASH = "c4f32c93423ba438296b63c57b0538f844a7ca010c08873d25c636f1cb8cb2ded3493599dd6d609c82bd361ebfde5022e71b9f48837cd02c708047c182887a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-bin"
RDEPENDS:${PN} += "/usr/bin/env perl perl(Biber) perl(LWP::UserAgent) perl(Text::BibTeX) perl(Text::Roman) texlive-biber-ms"

inherit rpm
