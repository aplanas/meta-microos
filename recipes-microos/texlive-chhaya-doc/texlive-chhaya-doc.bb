SUMMARY = "Documentation for texlive-chhaya"
DESCRIPTION = "This package includes the documentation for texlive-chhaya"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-doc-2023.201.0.0.4svn61719-53.1.noarch.rpm"
RPM_HASH = "5677d9d8edfe7e793e868a40f08d0457daf5b9a032771bfa8b427012f503de9285aab614a1703ca735e126bfdc2f903c79fa8bc4ab2568196b64664cbde2fbc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-chhaya-doc:mr) texlive-chhaya-doc"
RDEPENDS:${PN} += ""

inherit rpm
