SUMMARY = "Parsing and printing of S-expressions in Canonical form"
DESCRIPTION = "This library provides minimal support for Canonical S-expressions. Canonical S-expressions are a binary encoding of S-expressions that is super simple and well suited for communication between programs. \
 \
This library only provides a few helpers for simple applications. If you need more advanced support, such as parsing from more fancy input sources, you should consider copying the code of this library given how simple parsing S-expressions in canonical form is. \
 \
To avoid a dependency on a particular S-expression library, the only module of this library is parameterised by the type of S-expressions."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "ocaml-csexp-1.5.1-3.6.aarch64.rpm"
RPM_HASH = "a7f51d252efee6ac9175743e3ebcbeb3527d6dbedc106e1a7bc8d75480d6c6abb0cf7e099c36769cf0907cde0735280e267bfbfb017f7a35a883a8c13c6e42aa"

RPROVIDES:${PN} += "ocaml-csexp ocaml-csexp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
