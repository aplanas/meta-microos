SUMMARY = "A document-oriented database"
DESCRIPTION = "TinyDB is a document oriented database written in \
pure Python and has no external dependencies. \
The target are small apps that would be “blown away” by a SQL-DB or an \
external database server."
LICENSE = "MIT"

PV = "4.7.0"

RPM_NAME = "python39-tinydb-4.7.0-1.6.noarch.rpm"
RPM_HASH = "dc35eef3e79eb791be3ca5438ba0d0293517b065b265a41b32b4372e8559f03a2eaffd560fc6f4e077449b0cb70517ba99721fa35062b6712f6f084b55e4d21e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tinydb) python39-tinydb python3dist(tinydb)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
