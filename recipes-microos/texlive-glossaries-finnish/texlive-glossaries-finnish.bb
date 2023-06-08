SUMMARY = "Finnish language module for glossaries package"
DESCRIPTION = "Finnish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-2023.201.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "e336d0df2d8016b1e24b532f7212fad7ffe6e2a747b441afa9fa7e24fb9d89964c10461aebdfd7080bf3df55003afa7e4ffa2c19e5eca5ce076f44791657dfd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-finnish-ascii.ldf) tex(glossaries-finnish-utf8.ldf) tex(glossaries-finnish.ldf) texlive-glossaries-finnish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
