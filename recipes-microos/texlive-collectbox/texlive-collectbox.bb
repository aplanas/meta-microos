SUMMARY = "Collect and process macro arguments as boxes"
DESCRIPTION = "The package provides macros to collect and process a macro \
argument (i.e., something which looks like a macro argument) as \
a horizontal box rather than as a real macro argument. The \
'arguments' are stored as if they had been saved by \\savebox or \
by the lrbox environment. Grouping tokens \\bgroup and \\egroup \
may be used, which allows the user to have the beginning and \
end of a group in different macro invocations, or to place them \
in the begin and end code of an environment. Arguments may \
contain verbatim material or other special use of characters. \
The macros were designed for use within other macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4csvn64967"

RPM_NAME = "texlive-collectbox-2023.201.0.0.4csvn64967-53.1.noarch.rpm"
RPM_HASH = "80ac2cdb07f386fabcf7ec3c6e419692514f215aed0c8b9a2a3e910e0082475f2b5b7a6ea147803e1513a2833043729554c7d1bc98db63611c933dfbd6f02654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(collectbox.sty) texlive-collectbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
