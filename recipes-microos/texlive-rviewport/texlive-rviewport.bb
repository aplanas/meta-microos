SUMMARY = "Relative Viewport for Graphics Inclusion"
DESCRIPTION = "Package graphicx provides a useful keyword viewport which \
allows to show just a part of an image. However, one needs to \
put there the actual coordinates of the viewport window. \
Sometimes it is useful to have relative coordinates as \
fractions of natural size. For example, one may want to print a \
large image on a spread, putting a half on a verso page, and \
another half on the next recto page. For this one would need a \
viewport occupying exactly one half of the file's bounding box, \
whatever the actual width of the image may be. This package \
adds a new keyword rviewport to the graphicx package \
specifiying Relative Viewport for graphics inclusion: a window \
defined by the given fractions of the natural width and height \
of the image."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23739"

RPM_NAME = "texlive-rviewport-2023.201.1.0svn23739-53.1.noarch.rpm"
RPM_HASH = "1379d642fc89816d24a69be72bee7766cec7bbe92065574665d6ec581c7f54bee6867264a2c8c3bec8000cfed7fc6f5fa8e1d6a82e49854ecf7450e66549800d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rviewport.sty) texlive-rviewport"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
