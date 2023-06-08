SUMMARY = "TeX definitions with named parameters"
DESCRIPTION = "This package provides a prefix \\named to be used in TeX \
definitions so that parameters can be identified by their name \
rather than by number, giving parameters a semantic rather than \
syntactic meaning, making it easy to understand long \
definitions. A usual definition reads: \\def\\SayHello#1{Hello, \
 \
\\named\\def\\SayHello#[person]{Hello, #[person]!} and \\named will \
figure out the numbering of the parameters for you."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55881"

RPM_NAME = "texlive-namedef-2023.201.1.0svn55881-54.1.noarch.rpm"
RPM_HASH = "90269a5368eb11ee226278c778ac1d2c380bb0885d65e71d6caf0b3bb2cbec3b8050c3583f38fd77c8a901ae999ce726539074a0fffd0460883a84ac0f4b2e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(namedef.sty) texlive-namedef"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3-generic.tex) tex(expl3.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-l3kernel texlive-scripts texlive-scripts-bin"

inherit rpm
