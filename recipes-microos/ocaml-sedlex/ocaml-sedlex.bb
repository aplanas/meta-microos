SUMMARY = "Unicode-friendly lexer generator"
DESCRIPTION = "A lexer generator for OCaml, similar to ocamllex, but supporting Unicode. \
Contrary to ocamllex, lexer specifications for sedlex are embedded in \
regular OCaml source files."
LICENSE = "MIT"

PV = "3.1"

RPM_NAME = "ocaml-sedlex-3.1-1.1.aarch64.rpm"
RPM_HASH = "5474e3e028132277a96b123323a5c214309121668548451929e9c7abd2f471313289c444e4ae9d2511086b5da85753246c97630b92a9267b8aafe67d680782c2"

RPROVIDES:${PN} += "ocaml-sedlex ocaml-sedlex(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
