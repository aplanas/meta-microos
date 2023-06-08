SUMMARY = "Development files for openjpeg2"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the development files for openjpeg2."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-devel-2.5.0-3.3.aarch64.rpm"
RPM_HASH = "9d6e408e64898da6899888bdbd7cc5c4a587514cf8f326b350c833a803a4c29d0eb9eaddf0c2508c84a2e87ef862aedbf106fffd28c4734759cb744094c3b0be"

RPROVIDES:${PN} += "openjpeg2-devel openjpeg2-devel(aarch-64) pkgconfig(libopenjp2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenjp2-7 openjpeg2"

inherit rpm
