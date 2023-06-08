SUMMARY = "Documentation for texlive-pdfprivacy"
DESCRIPTION = "This package includes the documentation for texlive-pdfprivacy"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-doc-2023.201.1.0svn45985-51.1.noarch.rpm"
RPM_HASH = "8bfa39e942158065ecc423cb983546f496e1669a94656a193a0519be33501b917ad4367cf29e9765e05d9156b46ab907b7fafc85ff2c4c61042c440cd980ebc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfprivacy-doc"
RDEPENDS:${PN} += ""

inherit rpm
