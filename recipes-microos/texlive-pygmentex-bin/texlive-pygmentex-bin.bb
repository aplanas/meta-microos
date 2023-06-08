SUMMARY = "Binary files of pygmentex"
DESCRIPTION = "Binary files of pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34996"

RPM_NAME = "texlive-pygmentex-bin-2023.20230311.svn34996-89.1.aarch64.rpm"
RPM_HASH = "70e9262c7e05a2b03830b6d5fd63879c06720e5d0ae45b63c97faf5bac7ae7a912538fc84acc7da3197c8633cb61723774dcf88ead6c4f9ebf9c330fe454d51b"

RPROVIDES:${PN} += "texlive-pygmentex-bin texlive-pygmentex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pygmentex"

inherit rpm
