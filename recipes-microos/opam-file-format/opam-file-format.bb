SUMMARY = "Parser and printer for the opam file syntax"
DESCRIPTION = "This is a parser and a printer for the opam file syntax."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "2.1.5"

RPM_NAME = "opam-file-format-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "0dc8549e4529b3ece3004f1a3d879209fcd6c265f6a3765d7fc291b59d245db6787eb2441db38858ea97a646f5db39489576dd782f549391fc6ad578d4c7e4f6"

RPROVIDES:${PN} += "opam-file-format opam-file-format(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
