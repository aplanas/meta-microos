SUMMARY = "Binary files of wordcount"
DESCRIPTION = "Binary files of wordcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn46165"

RPM_NAME = "texlive-wordcount-bin-2023.20230311.svn46165-89.1.aarch64.rpm"
RPM_HASH = "d313d74035cc2f596b26d3fb866d41995c250c36fee9d1df7f06aaebda723e31fec46d7a37e8bc7f238f1c5488b31dbd3c6475d903bca8e50dce98b919819a4b"

RPROVIDES:${PN} += "texlive-wordcount-bin texlive-wordcount-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-wordcount"

inherit rpm
