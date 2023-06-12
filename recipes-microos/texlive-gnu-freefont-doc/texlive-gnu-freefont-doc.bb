SUMMARY = "Documentation for texlive-gnu-freefont"
DESCRIPTION = "This package includes the documentation for texlive-gnu-freefont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn29349"

RPM_NAME = "texlive-gnu-freefont-doc-2023.201.svn29349-53.1.noarch.rpm"
RPM_HASH = "f850a2ff73347d6b760f8e3a020cea3020596c91d898bc300b75e91168f448077630d5105c70c19209694d26c468699e97b3f79792b40b12a6c2eff19a92e636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont-doc"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/python3"

inherit rpm
