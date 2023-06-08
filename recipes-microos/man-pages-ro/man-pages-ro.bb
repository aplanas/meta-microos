SUMMARY = "Translation of man pages in Romanian"
DESCRIPTION = "This package provides translations of man pages in Romanian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-ro-4.18.1-1.1.noarch.rpm"
RPM_HASH = "6804b1d4b8b7f40aeeb6cd7e680c6b282490e66b9654fb311fd797f71e598f05b6605125c1c24b33bc40c3d579a697b347361130595ed04e1ca0ee06350eb0f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:ro) man-pages-ro"
RDEPENDS:${PN} += "man-pages"

inherit rpm
