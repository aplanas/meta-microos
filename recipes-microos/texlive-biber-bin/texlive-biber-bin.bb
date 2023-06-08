SUMMARY = "Binary files of biber"
DESCRIPTION = "Binary files of biber"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn66402"

RPM_NAME = "texlive-biber-bin-2023.20230311.svn66402-89.1.noarch.rpm"
RPM_HASH = "1ba6a31cc70a048885653e7001b3f4503cc712b9502752cfa3702fe6ec57f8e18354519d8176d0fa956f164bcc1e83f57d48f8d3a34947e5736885dccf5a15dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-bin"
RDEPENDS:${PN} += "/usr/bin/perl perl perl(Biber) perl(LWP::UserAgent) perl(Text::BibTeX) perl(Text::Roman) texlive-biber"

inherit rpm
