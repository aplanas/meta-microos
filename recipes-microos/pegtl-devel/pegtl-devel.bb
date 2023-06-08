SUMMARY = "Parsing Expression Grammar (PEG) Template Library"
DESCRIPTION = "The Parsing Expression Grammar Template Library (PEGTL) is a C++11 \
library for creating parsers according to a Parsing Expression \
Grammar (PEG). Grammars are embedded as regular C++ code, and \
consist of template hierarchies of classes. These hierarchies \
naturally correspond to the inductive definition of PEGs. The \
library extends on the subject of PEGs with new expression types, \
actions that can be attached to grammar rules, and mechanisms to \
ensure helpful diagnostics in case of parsing errors."
LICENSE = "MIT"

PV = "3.2.7"

RPM_NAME = "pegtl-devel-3.2.7-1.2.noarch.rpm"
RPM_HASH = "1ae5409ad799bd527fd5f9b5602933781598be65c0353e5d5f8b362a13a17fb77ef79f44a14d8e7265ea19313f2f11f38bdadd276fe736c084a11595b53adf9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(pegtl) pegtl-devel"
RDEPENDS:${PN} += ""

inherit rpm
