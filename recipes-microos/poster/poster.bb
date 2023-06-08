SUMMARY = "Tool for printing posters over multiple pages"
DESCRIPTION = "This program scales a PostScript page to a given size (a poster). The \
output can be tiled on multiple sheets, and output media size can be \
chosen independently. Each tile (sheet) of a will bear cropmarks and \
slightly overlapping image for easier poster assembly. In principle it \
requires the input file to adhere to 'eps' (encapsulated postscript) \
conventions but it will work for many 'normal' postscript files as \
well. \
 \
 \
 \
Authors: \
-------- \
    Jos T.J. van Eijndhoven <J.T.J.v.Eijndhoven@ele.tue.nl> \
    Michael Goffioul <goffioul@imec.be>"
LICENSE = "GPL-2.0+"

PV = "20060221"

RPM_NAME = "poster-20060221-93.25.aarch64.rpm"
RPM_HASH = "4400b34e2d8c10232d3c5220e4cd7edca1ab78e29c1c0ad5685b2fc07ccaaeb185901eafa62f13dcb2826e8f4fee7f9637bff8cc5dfa2aab39e099ddf8b2c29c"

RPROVIDES:${PN} += "poster poster(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
