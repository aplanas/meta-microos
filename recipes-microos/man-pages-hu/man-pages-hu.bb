SUMMARY = "Translation of man pages in Hungarian"
DESCRIPTION = "This package provides translations of man pages in Hungarian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-hu-4.18.1-1.1.noarch.rpm"
RPM_HASH = "a1257ca343f5bc72cfce20a664b27943708759f0791caa6e98407e114a45bd1d3d7691f5fa01b878cd1fccff537cad767d8c494bf36c88a00cee3aa170ac7ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:hu) man-pages-hu"
RDEPENDS:${PN} += "man-pages"

inherit rpm
