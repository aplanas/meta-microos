SUMMARY = "Ocaml Constraint Programming Library"
DESCRIPTION = "FaCiLe is a constraint programming library on integer and integer set \
finite domains written in OCaml. It offers all usual facilities to \
create and manipulate finite domain variables, arithmetic expressions \
and constraints (possibly non-linear), built-in global constraints \
(difference, cardinality, sorting etc.) and search and optimization \
goals. FaCiLe as well allows you to build easily user-defined \
constraints and goals (including recursive ones), making pervasive use \
of OCaml higher-order functionals to provide a simple and flexible \
interface for the user. As FaCiLe is an OCaml library and not 'yet \
another language', the user benefits from type inference and strong \
typing discipline, high level of abstraction, a modules and objects \
system, as well as native code compilation efficiency, garbage \
collection and replay debugger, all features of OCaml (among many \
others) that allow to prototype and experiment quickly: modeling, data \
processing and interface are implemented with the same powerful and \
efficient language."
LICENSE = "LGPL-2.1+"

PV = "1.1.4"

RPM_NAME = "ocaml-facile-1.1.4-2.11.aarch64.rpm"
RPM_HASH = "ccbecf93e0e900dc94a9ca059e8a3e7125a7f7023a81d68d9ae9a43f39834ba22cb2c4534759bea4c889e24820fb8d6af18ae6adde07d7fb855fc0f0bd99d1e5"

RPROVIDES:${PN} += "ocaml-facile \
ocaml-facile(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
