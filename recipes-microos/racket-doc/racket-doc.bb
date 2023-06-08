SUMMARY = "Documentation HTML files for Racket"
DESCRIPTION = "A local installation of the Racket documentation system."
LICENSE = "Apache-2.0 | MIT"

PV = "8.8"

RPM_NAME = "racket-doc-8.8-1.3.noarch.rpm"
RPM_HASH = "2e7ea2ce8a4c0bfa24b27a5b9d297b74637e556a1086d8f9d0344c69876d0464ced2f8989227e4bd001f5a583483886df9870cab8ddbc77ed945882ec9d37c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "racket-doc racket:/usr/share/doc/packages/racket/docindex.sqlite"
RDEPENDS:${PN} += ""

inherit rpm
