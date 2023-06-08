SUMMARY = "Documentation for liborigin"
DESCRIPTION = "This package provides the documentation for liborigin."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "liborigin-doc-3.0.1-1.10.noarch.rpm"
RPM_HASH = "47d8834eff1deb5cb6cfe0acc1afa96e5771ae5fac1d4b939f71893c0d976c56fd06f3811cd1362cc81d9a367507cf907d7e08d6814d504985b6772b6a034512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "liborigin-doc"
RDEPENDS:${PN} += ""

inherit rpm
