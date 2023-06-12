SUMMARY = "Documentation for texlive-fontools"
DESCRIPTION = "This package includes the documentation for texlive-fontools"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn65706"

RPM_NAME = "texlive-fontools-doc-2023.201.svn65706-52.1.noarch.rpm"
RPM_HASH = "2b8db6f62239e1434cad83032289981cae9deef483501b3c4ead7c183015238d21cda44cf988fdc75bb5c5fb636283bbf7d93d061703572963aaf98e3f4ee3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(afm2afm.1) \
man(autoinst.1) \
man(ot2kpx.1) \
texlive-fontools-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
