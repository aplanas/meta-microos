SUMMARY = "Optical Character Recognition Program - Basic Graphical Interface"
DESCRIPTION = "GOCR is an optical character recognition program. It reads images in \
many formats and outputs a text file. It is also able to recognize \
and translate barcodes. \
 \
This package contains a basic graphical interface for GOCR."
LICENSE = "GPL-2.0-or-later"

PV = "0.52"

RPM_NAME = "gocr-gui-0.52-3.2.noarch.rpm"
RPM_HASH = "8a3917affb23f52fb90e2ea39ac5374cf23fe6f6687225382b4fb32f39f6407f637faaed35aad1d5674538c24651491f563f1cef532a55a5b6bcbfdaaae3f683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(gocr.desktop) gocr-gui"
RDEPENDS:${PN} += "/bin/sh gocr tk"

inherit rpm
