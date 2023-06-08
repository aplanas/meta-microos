SUMMARY = "Translation of man pages in Dutch"
DESCRIPTION = "This package provides translations of man pages in Dutch."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-nl-4.18.1-1.1.noarch.rpm"
RPM_HASH = "8d78bdc8517ee76ee2f97ccb4f1756a097e878f783c5dc2a5eb60bc4a902c294a25df22cc68f3cbe3292e78ffc674199cef00a581f657cc969af86ecf6957f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:nl) man-pages-nl"
RDEPENDS:${PN} += "man-pages"

inherit rpm
