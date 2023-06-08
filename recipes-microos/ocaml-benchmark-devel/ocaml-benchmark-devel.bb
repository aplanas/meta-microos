SUMMARY = "Development files for ocaml-benchmark"
DESCRIPTION = "The ocaml-benchmark-devel package contains libraries and signature files for \
developing applications that use ocaml-benchmark."
LICENSE = "LGPL-3.0-or-later-WITH-OCaml-linking-exception"

PV = "1.6"

RPM_NAME = "ocaml-benchmark-devel-1.6-1.24.aarch64.rpm"
RPM_HASH = "eac330a7c5a59123ef585685f8eb24ae9a3b2028541b6ac2cd01e3063d49bf9df8fb6265599b1adfe470631c8f6f2db362b9cc7556b9dc538bd4f18bf9fe8f4a"

RPROVIDES:${PN} += "ocaml(Benchmark) ocaml-benchmark-devel ocaml-benchmark-devel(aarch-64) ocamlfind(benchmark) ocamlx(Benchmark)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalLazy) ocaml(Stdlib) ocaml(Stdlib__Arg) ocaml(Stdlib__Array) ocaml(Stdlib__Bigarray) ocaml(Stdlib__Buffer) ocaml(Stdlib__Complex) ocaml(Stdlib__Either) ocaml(Stdlib__Filename) ocaml(Stdlib__Format) ocaml(Stdlib__Gc) ocaml(Stdlib__Int64) ocaml(Stdlib__Lazy) ocaml(Stdlib__List) ocaml(Stdlib__Map) ocaml(Stdlib__Printexc) ocaml(Stdlib__Printf) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml(Unix) ocaml-benchmark ocamlfind(unix) ocamlx(CamlinternalLazy) ocamlx(Stdlib) ocamlx(Stdlib__Arg) ocamlx(Stdlib__Array) ocamlx(Stdlib__Filename) ocamlx(Stdlib__Format) ocamlx(Stdlib__Gc) ocamlx(Stdlib__Int64) ocamlx(Stdlib__List) ocamlx(Stdlib__Map) ocamlx(Stdlib__Printf) ocamlx(Stdlib__String) ocamlx(Stdlib__Sys) ocamlx(Unix)"

inherit rpm
