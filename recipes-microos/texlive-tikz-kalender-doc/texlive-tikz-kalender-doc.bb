SUMMARY = "Documentation for texlive-tikz-kalender"
DESCRIPTION = "This package includes the documentation for texlive-tikz-kalender"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4fsvn52890"

RPM_NAME = "texlive-tikz-kalender-doc-2023.201.0.0.4fsvn52890-52.1.noarch.rpm"
RPM_HASH = "5e448c16395d7e667d2605fba1342d924b7733b9bf91131b6b6e41feaf0cc01b2d7133389b6b5b3c475e8a7ca57a0694d58bbb7139fb7676c66196c4a622365b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-kalender-doc"
RDEPENDS:${PN} += ""

inherit rpm
