SUMMARY = "Catalan ispell dictionary"
DESCRIPTION = "This package includes a ready Catalan dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-catalan-1.5-422.6.aarch64.rpm"
RPM_HASH = "98027c6bf62a38988df5f1b6f8f19d31f74b78aa56e29f21e32d3b7bd3c72da53427ed3fa5351ff04782d9bf66f9d8332c3f895e16ba6a3569a6099d1ae23d74"

RPROVIDES:${PN} += "icatalan ispell-catalan ispell-catalan(aarch-64) ispell_dictionary locale(ispell:ca)"
RDEPENDS:${PN} += ""

inherit rpm
