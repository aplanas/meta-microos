SUMMARY = "Translation of man pages in Polish"
DESCRIPTION = "This package provides translations of man pages in Polish."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-pl-4.18.1-1.1.noarch.rpm"
RPM_HASH = "c1b16842b1c31ea54ab1595537c24f886e94e40b05a16518023f0a09d81116d43add9570a8accec6dde3d3f4e1863a1b4d3472574d1719e6908c35b79e40fef6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:pl) man-pages-pl"
RDEPENDS:${PN} += "man-pages"

inherit rpm
