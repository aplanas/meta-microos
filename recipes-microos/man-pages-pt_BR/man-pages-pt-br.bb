SUMMARY = "Translation of man pages in Brazilian Portuguese"
DESCRIPTION = "This package provides translations of man pages in Brazilian Portuguese."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-pt_BR-4.18.1-1.1.noarch.rpm"
RPM_HASH = "b26eb259bd059348126082913284b583054c3b173212fc154bd869a9f8c8b95002ce01c53223df4fe2cb75e718e77de31a64d77409b382e1aeb327dcde30c0a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:pt_BR) man-pages-pt_BR"
RDEPENDS:${PN} += "man-pages"

inherit rpm
