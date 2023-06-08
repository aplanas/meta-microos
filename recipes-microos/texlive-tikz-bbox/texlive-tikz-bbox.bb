SUMMARY = "Precise determination of bounding boxes in TikZ"
DESCRIPTION = "The built-in determination of the bounding box in TikZ is not \
entirely accurate. This is because, for Bezier curves, it is \
the smallest box that contains all control points, which is in \
general larger than the box that just contains the curve. This \
library determines the exact bounding box of the curve."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57444"

RPM_NAME = "texlive-tikz-bbox-2023.201.0.0.1svn57444-54.1.noarch.rpm"
RPM_HASH = "416f5969ca0047efe8286fe9f51f7b5153e1bb7072ff97ee3d7cfc3699c665fdb3385af5218dca2a51b3e82c16d5d663be4fbaf7dbc904479b79c95f36773dc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgflibrarybbox.code.tex) texlive-tikz-bbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
