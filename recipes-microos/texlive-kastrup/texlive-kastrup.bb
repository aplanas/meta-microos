SUMMARY = "Convert numbers into binary, octal and hexadecimal"
DESCRIPTION = "Provides expandable macros for both fixed-width and \
minimum-width numbers to bases 2, 4, 8 and 16."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-kastrup-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "e5028bafd536ce829db1d93d8017bffcd97caf2b5a3a805cd24cb9382831d05da284b040ab43ba690129816f199d59c3e60af26bfbd36dc62720277cb461b1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(binhex.tex) texlive-kastrup"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
