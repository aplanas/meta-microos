SUMMARY = "Translation of man pages in Czech"
DESCRIPTION = "This package provides translations of man pages in Czech."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-cs-4.18.1-1.1.noarch.rpm"
RPM_HASH = "093f53d620c4a62f228448c38dc89d276ea889d76d1d1ef62a97388e87fd69a8c094b492cb800fcb2bded88c49a257eb10918f050b453db212cf9ac320123ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:cs) man-pages-cs"
RDEPENDS:${PN} += "man-pages"

inherit rpm
