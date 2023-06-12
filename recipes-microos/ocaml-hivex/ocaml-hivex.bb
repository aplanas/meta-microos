SUMMARY = "OCAML bindings for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "888ecd0ffa9732aa93544ae2ced9a94b906a96dc1fb95154b5929b8c2b97f582cbaf4007f62f31b083b39edbe4af0aab47a073f128cb8a32fe55f5cd0f6c2898"

RPROVIDES:${PN} += "ocaml-hivex \
ocaml-hivex(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
