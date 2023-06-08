SUMMARY = "Graph library for OCaml"
DESCRIPTION = "OCamlgraph is a graph library for Objective Caml."
LICENSE = "LGPL-2.1"

PV = "2.0.0"

RPM_NAME = "ocaml-ocamlgraph-2.0.0-1.15.aarch64.rpm"
RPM_HASH = "23a077f8ecce37b559ba9a91adfc0e6becaccdf7ba5c4c81a45e0ec03e5b7d20d9629a223307e8c84a6c870cdc644ae124b0b9d6c3bff6a0ab9becc595ce78bf"

RPROVIDES:${PN} += "ocaml-ocamlgraph ocaml-ocamlgraph(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
