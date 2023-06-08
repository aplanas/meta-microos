SUMMARY = "German language module for the datetime2 package"
DESCRIPTION = "This module provides the 'german' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn53125"

RPM_NAME = "texlive-datetime2-german-2023.201.3.0svn53125-52.1.noarch.rpm"
RPM_HASH = "9236cabf3c5eeb0f008f18fee7d4ac15deba91b1e884a03f3bf698875ab5651bdda6e9ea1ab35a89c119249acc9d2384679d10e0c5cf1408f70e4f78cea4946b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-de-AT.ldf) tex(datetime2-de-CH.ldf) tex(datetime2-de-DE.ldf) tex(datetime2-german-base-ascii.ldf) tex(datetime2-german-base-utf8.ldf) tex(datetime2-german-base.ldf) tex(datetime2-german.ldf) texlive-datetime2-german"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
