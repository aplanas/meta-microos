SUMMARY = "Print a date relative to 'today'"
DESCRIPTION = "Provides macros which can add a specified number of days to the \
current date (as specified in \\today), to save, set and restore \
the 'current date' and to print it. Intended use is, for \
example, in invoices 'payable within 14 days from today', etc. \
The package has only been tested with Czech dates."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20538"

RPM_NAME = "texlive-advdate-2023.201.svn20538-54.1.noarch.rpm"
RPM_HASH = "3817fe6af3e3e4a91763bbc86c6daa156c13776d5e3514c3533ab197d1547515eb6b9200433d3990e71d96b96d655b77eb99400484bb8791ac77030da1951e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(advdate.sty) texlive-advdate"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
