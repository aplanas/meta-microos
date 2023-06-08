SUMMARY = "References to ranges of footnotes"
DESCRIPTION = "The package provides the environments footnoterange and \
footnoterange*. Multiple footnotes inside these environments \
are not referenced as (e.g.) '1 2 3' but as '1-3', i.e., the \
range (from first to last referred footnote at that place) is \
given. If the hyperref package is loaded with enabled \
hyperfootnotes-option, then the references are hyperlinked. \
(References to footnotes in footnoterange* environments are \
never hyperlinked.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn66149"

RPM_NAME = "texlive-footnoterange-2023.201.1.1asvn66149-52.1.noarch.rpm"
RPM_HASH = "7fec133f8fae9318c8276679fa55db20d80fa88f47f2427d83e70a4082da9987c53b071c34a0433e45e2a36e4f192fd4211c8f16eab4527eccc40d3bebe54606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(footnoterange.sty) texlive-footnoterange"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
