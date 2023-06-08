SUMMARY = "MetaPost macros for 3D"
DESCRIPTION = "These macros allow the production of three-dimensional schemes \
containing: angles, circles, cylinders, cones and spheres, \
among other things."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-2023.201.0.0.8.8svn35346-52.1.noarch.rpm"
RPM_HASH = "7d8a6d43328ffd56bbbfada84268e040d98cc7c8b95dfebce32a12fbb67adab07f9b01eb57c58af8e4f8ffe661dfaaedcf62dc67d9d06469411af36ac58c296e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
