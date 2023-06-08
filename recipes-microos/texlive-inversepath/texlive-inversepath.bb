SUMMARY = "Calculate inverse file paths"
DESCRIPTION = "The package calculates inverse relative paths. Such things may \
be useful, for example, when writing an auxiliary file to a \
different directory."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "5fabfc15635f5682af174fdff4c70c8f73c133dc5778ff8d482f574dd2dc762c6e872c78baddd3a74eb483ee9f1a16acac0f9b5462910121165f94ffed6eea4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(inversepath.sty) texlive-inversepath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
