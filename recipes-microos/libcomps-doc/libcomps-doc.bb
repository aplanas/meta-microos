SUMMARY = "Documentation files for libcomps library"
DESCRIPTION = "Documentation files for libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.19"

RPM_NAME = "libcomps-doc-0.1.19-2.3.noarch.rpm"
RPM_HASH = "bccbee753c3dcf4fde936410ac8d6be726b490f7ef88b5b5cf50589f80f4781ee605466dafcde443e46ad0054773950d262064c873221d64f392a8ec87fe2898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcomps-doc"
RDEPENDS:${PN} += ""

inherit rpm
