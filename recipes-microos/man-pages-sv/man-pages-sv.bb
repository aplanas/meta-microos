SUMMARY = "Translation of man pages in Swedish"
DESCRIPTION = "This package provides translations of man pages in Swedish."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-sv-4.18.1-1.1.noarch.rpm"
RPM_HASH = "dfd4d605a8f283abbf1b57407eae707fb93e07dcf87f33e413f14c14f3a0759bef4a42e0db4c4aa201c11cab24f641f311a45740dcff5fdde44f7aa2d6228f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:sv) man-pages-sv"
RDEPENDS:${PN} += "man-pages"

inherit rpm
