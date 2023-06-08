SUMMARY = "Binary files of texdiff"
DESCRIPTION = "Binary files of texdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15506"

RPM_NAME = "texlive-texdiff-bin-2023.20230311.svn15506-89.1.aarch64.rpm"
RPM_HASH = "eb80f5b866b0679385a7efcaa23f3e2b0e5ee5a79bca263be565c2b815958a92aa9e361f7358a7421a7441dbd7ce3c3f7ae95bd547b0117950fadb5c7717059e"

RPROVIDES:${PN} += "texlive-texdiff-bin texlive-texdiff-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdiff"

inherit rpm
