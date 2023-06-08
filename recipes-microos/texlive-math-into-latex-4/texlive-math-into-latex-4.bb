SUMMARY = "Samples from Math into LaTeX, 4th Edition"
DESCRIPTION = "Samples for the book `(More) Math into LaTeX', 4th edition. In \
addition, there are two excerpts from the book: A Short Course \
to help you get started quickly with LaTeX, including detailed \
instructions on how to install LaTeX on a PC or a Mac; Math and \
Text Symbol Tables."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44131"

RPM_NAME = "texlive-math-into-latex-4-2023.201.svn44131-52.1.noarch.rpm"
RPM_HASH = "acda2c395a3b703a6ea4e4322fc8839642c89141311e298891a7182cc2d9145fce6a30e2e9682cfc7384e255d4da4afb4f2a1393cd19eddb299ce7c4e38d1a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-math-into-latex-4"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
