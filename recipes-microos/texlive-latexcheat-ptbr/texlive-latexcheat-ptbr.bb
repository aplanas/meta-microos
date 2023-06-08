SUMMARY = "A LaTeX cheat sheet, in Brazilian Portuguese"
DESCRIPTION = "This is a translation to Brazilian Portuguese of Winston \
Chang's LaTeX cheat sheet"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.13svn15878"

RPM_NAME = "texlive-latexcheat-ptbr-2023.201.1.13svn15878-54.1.noarch.rpm"
RPM_HASH = "3d3072c9e797efb164ead480e62b60d908e3803d2125139b1454c198b729ef2b701841cae40d03b1674b2254c6abf6a6d25ff913881ce564c23121f81bde42b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-ptbr"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
