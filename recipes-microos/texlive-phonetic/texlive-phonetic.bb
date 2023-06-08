SUMMARY = "Metafont Phonetic fonts, based on Computer Modern"
DESCRIPTION = "The fonts are based on Computer Modern, and specified in \
Metafont. Macros for the fonts' use are provided, both for \
LaTeX 2.09 and for current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn56468"

RPM_NAME = "texlive-phonetic-2023.201.svn56468-51.1.noarch.rpm"
RPM_HASH = "cc768fc4864490a5bbdf7e9a932e4fc91789a471e1e4fed5ae47c65634d55dfe8c71a4a6adcac021b05f911e3feae8600bb07a0ecd88ed7964fd55fd056007c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Uphon.fd) tex(cmph10.tfm) tex(cmph5.tfm) tex(cmph6.tfm) tex(cmph7.tfm) tex(cmph8.tfm) tex(cmph9.tfm) tex(cmphb10.tfm) tex(cmphi10.tfm) tex(cmphi7.tfm) tex(cmphi8.tfm) tex(cmphi9.tfm) tex(phonetic.sty) texlive-phonetic"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
