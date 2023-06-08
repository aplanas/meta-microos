SUMMARY = "TeX Live manual (English)"
DESCRIPTION = "The texlive-en package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66572"

RPM_NAME = "texlive-texlive-en-2023.201.svn66572-54.1.noarch.rpm"
RPM_HASH = "bbdb3904445e407464e4e4213b2d0f62756e438303e6416b44b40d7b4e78f164213e9b432c3cddc43e0a371e60e593c06dfc0a903a5976060c104b89f3c7d08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-en"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
