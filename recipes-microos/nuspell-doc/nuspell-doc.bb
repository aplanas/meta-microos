SUMMARY = "API documentation for Nuspell"
DESCRIPTION = "This package provides API documentation for Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.2"

RPM_NAME = "nuspell-doc-5.1.2-1.4.noarch.rpm"
RPM_HASH = "ea34b5a18e4f076b07572718f64130ea23ee991078f35c141aa9d93acce4363bc85e8cc6b4fd390ac5c59a7f30664453b8462f866ca37b888704e79229386544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nuspell-doc"
RDEPENDS:${PN} += ""

inherit rpm
