SUMMARY = "Multimedia inclusion for the dvisvgm backend"
DESCRIPTION = "This package implements an interface for embedding video and \
audio files in SVG (Scalable Vector Graphics) output. SVG with \
embedded media is very portable, as it is supported by all \
modern Web browsers across a variety of operating systems and \
platforms, including portable devices. All DVI producing TeX \
engines can be used. The dvisvgm utility, which is part of all \
major TeX distributions, converts the intermediate DVI to SVG. \
By default, media files are embedded into the SVG output to \
make self-sufficient SVG files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn64686"

RPM_NAME = "texlive-media4svg-2023.201.0.0.13svn64686-52.1.noarch.rpm"
RPM_HASH = "df48f0a2fe94ad6374be71a4cb3b9e1f73a10ce7ec2375f72541a205c490fc87cded87b6dc108b63131f311482945d5c68f1f709d5925d24ac3eb908d52783d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(media4svg.sty) texlive-media4svg"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua coreutils ed findutils grep sed tex(pdfbase.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
