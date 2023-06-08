SUMMARY = "Bibtex parser for python"
DESCRIPTION = "Python library to parse bibtex files.."
LICENSE = "BSD-3-Clause | LGPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "python311-bibtexparser-1.2.0-1.7.noarch.rpm"
RPM_HASH = "f62dcd9ff7c86983501b89afd4dcda8590091018b253592f85b9397a788df1d716e42675b08328ea4f41b40d0ed96b9cd36ffa3c8ebd64cdc9dba59dc66d2481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bibtexparser) python311-bibtexparser python3dist(bibtexparser)"
RDEPENDS:${PN} += "python(abi) python311-future python311-pyparsing"

inherit rpm
