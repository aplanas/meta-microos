SUMMARY = "Translation of man pages in Russian"
DESCRIPTION = "This package provides translations of man pages in Russian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-ru-4.18.1-1.1.noarch.rpm"
RPM_HASH = "b8424f9d50f6131b13f3b155889be415e2a6d3558105ccfd898257929dbc088b6e629ec6eca5ae3fd0b6829c14e061f45058918b653f28608891632f595cad71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:ru) man-pages-ru"
RDEPENDS:${PN} += "man-pages"

inherit rpm
