SUMMARY = "Addresses on envelopes or mailing labels"
DESCRIPTION = "A LaTeX package for producing mailing envelopes and labels, \
including barcodes and address formatting according to the US \
Postal Service rules. Redefines the standard \\makelabels \
command of the LaTeX letter documentclass."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61937"

RPM_NAME = "texlive-envlab-2023.201.1.2svn61937-53.1.noarch.rpm"
RPM_HASH = "5e243dcf83c4a8c9e2b1ab4ab7e50f154cf2d49d8d6c5f161970216db3230e979855a52fb433c790cbdb003ee1b0d3a7c1a0d639c94115561970eed829382178"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(envlab.cfg) tex(envlab.sty) texlive-envlab"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphics.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
