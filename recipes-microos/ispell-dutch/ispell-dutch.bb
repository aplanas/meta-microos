SUMMARY = "Dutch ispell dictionary"
DESCRIPTION = "This package includes a ready Dutch dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-dutch-1.5-422.6.aarch64.rpm"
RPM_HASH = "36d84e8e4e265f065fe52d6f4b7b6652b9256f2c7668df1be47c59cf6bfd96fd68aaba875781aa552d98cc946b2ccc8f885e08d8190a8d4c8b354d823bae1146"

RPROVIDES:${PN} += "idutch ispell-dutch ispell-dutch(aarch-64) ispell_dictionary locale(ispell:nl)"
RDEPENDS:${PN} += ""

inherit rpm
