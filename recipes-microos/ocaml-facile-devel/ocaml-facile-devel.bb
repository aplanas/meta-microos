SUMMARY = "Development files for ocaml-facile"
DESCRIPTION = "The ocaml-facile-devel package contains libraries and signature files for \
developing applications that use ocaml-facile."
LICENSE = "LGPL-2.1+"

PV = "1.1.4"

RPM_NAME = "ocaml-facile-devel-1.1.4-2.11.aarch64.rpm"
RPM_HASH = "8914745b1af7f15da36ef53bab662548b1934590f336fbc112f0e8f7711b67fe0f9448c4583d5ffdec880065e30f9583ded73a1d59faf0001d2199ed2c372277"

RPROVIDES:${PN} += "ocaml(Facile) \
ocaml(Facile__) \
ocaml(Facile__Fcl_alldiff) \
ocaml(Facile__Fcl_arith) \
ocaml(Facile__Fcl_boolean) \
ocaml(Facile__Fcl_conjunto) \
ocaml(Facile__Fcl_cstr) \
ocaml(Facile__Fcl_data) \
ocaml(Facile__Fcl_debug) \
ocaml(Facile__Fcl_domain) \
ocaml(Facile__Fcl_expr) \
ocaml(Facile__Fcl_fdArray) \
ocaml(Facile__Fcl_float) \
ocaml(Facile__Fcl_gcc) \
ocaml(Facile__Fcl_genesis) \
ocaml(Facile__Fcl_goals) \
ocaml(Facile__Fcl_interval) \
ocaml(Facile__Fcl_invariant) \
ocaml(Facile__Fcl_linear) \
ocaml(Facile__Fcl_misc) \
ocaml(Facile__Fcl_nonlinear) \
ocaml(Facile__Fcl_opti) \
ocaml(Facile__Fcl_reify) \
ocaml(Facile__Fcl_setDomain) \
ocaml(Facile__Fcl_sorting) \
ocaml(Facile__Fcl_stak) \
ocaml(Facile__Fcl_var) \
ocaml-facile-devel \
ocaml-facile-devel(aarch-64) \
ocamlfind(facile) \
ocamlx(Facile) \
ocamlx(Facile__) \
ocamlx(Facile__Fcl_alldiff) \
ocamlx(Facile__Fcl_arith) \
ocamlx(Facile__Fcl_boolean) \
ocamlx(Facile__Fcl_conjunto) \
ocamlx(Facile__Fcl_cstr) \
ocamlx(Facile__Fcl_data) \
ocamlx(Facile__Fcl_debug) \
ocamlx(Facile__Fcl_domain) \
ocamlx(Facile__Fcl_expr) \
ocamlx(Facile__Fcl_fdArray) \
ocamlx(Facile__Fcl_float) \
ocamlx(Facile__Fcl_gcc) \
ocamlx(Facile__Fcl_genesis) \
ocamlx(Facile__Fcl_goals) \
ocamlx(Facile__Fcl_interval) \
ocamlx(Facile__Fcl_invariant) \
ocamlx(Facile__Fcl_linear) \
ocamlx(Facile__Fcl_misc) \
ocamlx(Facile__Fcl_nonlinear) \
ocamlx(Facile__Fcl_opti) \
ocamlx(Facile__Fcl_reify) \
ocamlx(Facile__Fcl_setDomain) \
ocamlx(Facile__Fcl_sorting) \
ocamlx(Facile__Fcl_stak) \
ocamlx(Facile__Fcl_var)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Buffer) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__Hashtbl) \
ocaml(Stdlib__Int32) \
ocaml(Stdlib__Int64) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Nativeint) \
ocaml(Stdlib__Printf) \
ocaml(Stdlib__Random) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__Set) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml(Stdlib__Weak) \
ocaml-facile \
ocamlfind(stdlib-shims) \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Hashtbl) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__Printf) \
ocamlx(Stdlib__Random) \
ocamlx(Stdlib__Set) \
ocamlx(Stdlib__Sys) \
ocamlx(Stdlib__Weak)"

inherit rpm
