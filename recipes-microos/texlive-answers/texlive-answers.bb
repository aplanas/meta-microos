SUMMARY = "Setting questions (or exercises) and answers"
DESCRIPTION = "The package allows a lot of flexibility in constructing \
question and answer sheets."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.16svn35032"

RPM_NAME = "texlive-answers-2023.201.2.16svn35032-54.1.noarch.rpm"
RPM_HASH = "2bbc971d2d09a8b5be2f9580eef2d97828e3209d6b7a8dd05a428e48d060aa2449d06e7066b544f334416d6cb5c617542b41a7d35f68916e5e8794349ab47f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(answers.sty) texlive-answers"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(verbatim.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
