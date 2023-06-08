SUMMARY = "LaTeX support for documents written in Peano's Interlingua"
DESCRIPTION = "Latino sine Flexione (or Interlingua) is a language constructed \
by Giuseppe Peano at the beginning of the last century. This \
simplified Latin is designed to be an instrument for \
international cooperation, especially in the academic sphere. \
(Note that this 'Interlingua' is different from the \
'Interlingua' that was created a few decades after Peano's work \
and which is supported by babel-interlingua!) This package \
provides the necessary translations to use the language within \
a LaTeX document. It also imports fontenc in order to be able \
to use ligatures and quotation marks. Finally, it offers a text \
in Interlingua that can be used as a dummy text: Fundamento de \
intelligentia. This article by H. Bijlsma was first published \
in Schola et Vita Anno I (1926)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn53485"

RPM_NAME = "texlive-latino-sine-flexione-2023.201.1.2svn53485-54.1.noarch.rpm"
RPM_HASH = "e8194183af4cd30910c816c24da2bb0db153d49a5812e355b88f68ce9632f1b416d9cff420b06e4c8c12659e0c6693a2d9c0cd541ebe9a370a8858965b28af0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latino-sine-flexione.sty) texlive-latino-sine-flexione"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(datetime.sty) tex(fontenc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
