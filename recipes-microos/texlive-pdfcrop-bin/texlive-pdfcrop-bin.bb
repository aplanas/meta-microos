SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2023.20230311.svn14387-89.1.aarch64.rpm"
RPM_HASH = "e2d8c38aab23526f85f34a98c6c2ea48066aae23e02efc4e801c566138722c5748e382e1e9ad1034b5928f38d484dde9b7732e944e02eda6856b34a1943ccfec"

RPROVIDES:${PN} += "texlive-pdfcrop-bin texlive-pdfcrop-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
