SUMMARY = "Binary files of texdoc"
DESCRIPTION = "Binary files of texdoc"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn47948"

RPM_NAME = "texlive-texdoc-bin-2023.20230311.svn47948-89.1.aarch64.rpm"
RPM_HASH = "7624787f544a6a3f21ef9a1ea33fcf6610999e64acd88d6d7c9ea5f358100d381a5dcb1bdae017da896665cca0a305fe83512fb3dc4ace719d25a8a5aea9aec2"

RPROVIDES:${PN} += "texlive-texdoc-bin texlive-texdoc-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdoc"

inherit rpm
