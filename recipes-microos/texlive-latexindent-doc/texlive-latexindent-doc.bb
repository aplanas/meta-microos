SUMMARY = "Documentation for texlive-latexindent"
DESCRIPTION = "This package includes the documentation for texlive-latexindent"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.20.3svn65937"

RPM_NAME = "texlive-latexindent-doc-2023.201.3.20.3svn65937-54.1.noarch.rpm"
RPM_HASH = "1386bcf8f3adb6accfffe6dd3e5c4b1d93cebc59eb37edbe084c2a75e01c24d4dc16faa0b0830edf238a25d4bb7ba4d2323072a9b2dd81e434fe5ebe75cff25b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexindent-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
