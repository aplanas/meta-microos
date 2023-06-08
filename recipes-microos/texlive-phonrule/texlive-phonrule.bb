SUMMARY = "Typeset linear phonological rules"
DESCRIPTION = "The package provides macros for typesetting phonological rules \
like those in 'Sound Pattern of English' (Chomsky and Halle \
1968)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.2svn43963"

RPM_NAME = "texlive-phonrule-2023.201.1.3.2svn43963-51.1.noarch.rpm"
RPM_HASH = "95673737cfa8f4074239d08b16f3a751b8aa4af29ba2a84c44cf61c8c2eb664befd824062b613f70fd4602c8da14e41c7b853c0790ea27ef73b91f42655e995f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phonrule.sty) texlive-phonrule"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
