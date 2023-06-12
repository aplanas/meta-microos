SUMMARY = "Stream and Genlex libraries for use with Camlp5"
DESCRIPTION = "The camlp-streams package provides two library modules: \
 \
Stream: imperative streams, with in-place update and memoization of the latest element produced. \
Genlex: a small parameterized lexical analyzer producing streams of tokens from streams of characters. \
 \
The two modules are designed for use with Camlp5: \
 \
The stream patterns and stream expressions of Camlp5 consume and produce data of type 'a Stream.t. \
The Genlex tokenizer can be used as a simple lexical analyzer for Camlp5-generated parsers. \
 \
The Stream module can also be used by hand-written recursive-descent parsers, but is not very convenient for this purpose. \
 \
The Stream and Genlex modules have been part of the OCaml standard library for a long time, and have been distributed as part of the core OCaml system. They will be removed from the OCaml standard library at some future point, but will be maintained and distributed separately in this camlp-streams package."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception"

PV = "5.0.1"

RPM_NAME = "ocaml-camlp-streams-5.0.1-2.4.aarch64.rpm"
RPM_HASH = "6694ca467cb053426330f8182c499820c7b861807ef139cd82eb1d1171649c7b7574afcc6e1d171df4efc94f9f93d2cc06fd3a7d59fc6d98aa3215bddec0200b"

RPROVIDES:${PN} += "ocaml-camlp-streams \
ocaml-camlp-streams(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
