SUMMARY = "Irish language module for glossaries package"
DESCRIPTION = "Irish language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "a216087e60341aa1c344bf809072841e6298515fc9c0b9f22468f164b12a8f449652bae4a33151f00053503df189a19ae6227a9eff31832e38c52ab7fd7bb631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(glossaries-irish-noenc.ldf) tex(glossaries-irish-utf8.ldf) tex(glossaries-irish.ldf) texlive-glossaries-irish"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
