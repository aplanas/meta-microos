SUMMARY = "Easy translation of strings in LaTeX"
DESCRIPTION = "This LaTeX package provides a flexible mechanism for \
translating individual words into different languages. For \
example, it can be used to translate a word like 'figure' into, \
say, the German word 'Abbildung'. Such a translation mechanism \
is useful when the author of some package would like to \
localize the package such that texts are correctly translated \
into the language preferred by the user. This package is not \
intended to be used to automatically translate more than a few \
words."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.12dsvn59412"

RPM_NAME = "texlive-translator-2023.201.1.12dsvn59412-52.1.noarch.rpm"
RPM_HASH = "68fe6b4607cb05b1aac95e9ebfa273cf0d61f6aa576af8e47b7fa5b79580cf90f1feed2ec40284bf9c40893d8ee86ffd7858ae4c617de81772ae3c596ed006a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(translator.sty) texlive-translator"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
