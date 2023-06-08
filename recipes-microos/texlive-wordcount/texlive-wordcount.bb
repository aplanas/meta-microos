SUMMARY = "Estimate the number of words in a LaTeX document"
DESCRIPTION = "The package provides a relatively easy way of estimating the \
number of words in a LaTeX document that does not require \
dvitty or other DVI converters. It does however require \
something like Unix grep -c that can search a file for a \
particular string and report the number of matching lines. An \
accompanying shell script wordcount.sh contains more \
information in its comments."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn46165"

RPM_NAME = "texlive-wordcount-2023.201.1.7svn46165-53.1.noarch.rpm"
RPM_HASH = "67bbc7f0a7b6779a6eec57b1effa20fafb08a86f0e3a653cdbdf6caa8a409adc9646627920e02b88c48a53a01caabad4022d158ad64d7ead08744fb57b758cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wordcount.tex) texlive-wordcount"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin texlive-wordcount-bin"

inherit rpm
