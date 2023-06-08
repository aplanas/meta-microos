SUMMARY = "Maps over integers implemented as Patricia trees"
DESCRIPTION = "OCaml implementation of an efficient maps over integers, \
from a paper by Chris Okasaki."
LICENSE = "LGPL-2.1-or-later-WITH-OCaml-linking-exception"

PV = "2.0.5"

RPM_NAME = "ocaml-ptmap-2.0.5-1.16.aarch64.rpm"
RPM_HASH = "12cb168957d1e8edc7485b7624c4cca9c50472fee183a4cc5561af9612169ec74dfaba77444ba7dc575b71edad35fff39aff00bf22bf1f644a0c333e3861cd06"

RPROVIDES:${PN} += "ocaml-ptmap ocaml-ptmap(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
