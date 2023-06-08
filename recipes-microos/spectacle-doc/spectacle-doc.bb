SUMMARY = "Documentation for Spectacle"
DESCRIPTION = "This package contains the documentation available for Spectacle, which is a \
screenshot capture program by KDE."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "spectacle-doc-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f1875be5703c92629f1ba12c9cce3e1e864389e6edd6a316fcf1944e845c4fd6e609910f473eba23f507fa5c2f04acf159f099d972b1de6c9ccbbfc9efc82dd2"

RPROVIDES:${PN} += "spectacle-doc spectacle-doc(aarch-64)"
RDEPENDS:${PN} += "spectacle"

inherit rpm
