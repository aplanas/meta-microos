SUMMARY = "Binary files of pst2pdf"
DESCRIPTION = "Binary files of pst2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29333"

RPM_NAME = "texlive-pst2pdf-bin-2023.20230311.svn29333-91.1.aarch64.rpm"
RPM_HASH = "e43ab7827109c872223181599802b5e0f4ee4ec9789a40d0f20b85c4046e13306c8c3022eb95140924b8ed72d0bc5504ff260a14b50492afa007a4539968f4c5"

RPROVIDES:${PN} += "texlive-pst2pdf-bin texlive-pst2pdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pst2pdf"

inherit rpm
