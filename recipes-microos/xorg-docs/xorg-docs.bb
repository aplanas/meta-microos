SUMMARY = "Miscellaneous documentation for the X Window System"
DESCRIPTION = "This package provides miscellaneous documentation for the X Window \
System that doesn't better fit into other packages."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "xorg-docs-1.7.2-1.5.noarch.rpm"
RPM_HASH = "9fcbcd83ae4ec3a5074bf034784e5969387f9abc7b1745003e46dc12468e1c8fe89223131fe46e5c11509460a3146fe8baf14030b4873f9d5cb45c5bc117baa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-docs xorg-x11-doc"
RDEPENDS:${PN} += ""

inherit rpm
