SUMMARY = "Llmk: A build tool for LaTeX documents"
DESCRIPTION = "Light LaTeX Make (llmk) is yet another build tool specific for \
LaTeX documents. Its aim is to provide a simple way to specify \
a workflow of processing LaTeX documents and encourage people \
to always explicitly show the right workflow for each document. \
The main features of llmk are all about the above purpose. \
First, you can describe the workflows either in an external \
file llmk.toml or in a LaTeX document source in the form of \
magic comments. Further, multiple magic comment formats can be \
used. Second, it is fully cross-platform. The only requirement \
of the program is the texlua command; llmk provides a uniform \
way to describe the workflows available for nearly all TeX \
environments. Third, it behaves exactly the same in any \
environment. At this point, llmk intentionally does not provide \
any method for user configuration. Therefore one can guarantee \
that for a LaTeX document with an llmk setup, the process of \
typesetting the document will be reproduced in any TeX \
environment with the program."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn66473"

RPM_NAME = "texlive-light-latex-make-2023.201.1.2.0svn66473-54.1.noarch.rpm"
RPM_HASH = "dd89d2c48bb65514563f40abb09a4847283ea3e136d94195f81fe545ad87b87b473dbc8f388aaa5c7a2aff516c548ec16be266b57efa6eaf0c4cb727f5be693b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-light-latex-make"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-light-latex-make-bin texlive-scripts texlive-scripts-bin"

inherit rpm
