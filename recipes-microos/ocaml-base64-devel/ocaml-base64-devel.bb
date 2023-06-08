SUMMARY = "Development files for ocaml-base64"
DESCRIPTION = "The ocaml-base64-devel package contains libraries and signature files for \
developing applications that use ocaml-base64."
LICENSE = "ISC"

PV = "3.5.1"

RPM_NAME = "ocaml-base64-devel-3.5.1-1.3.aarch64.rpm"
RPM_HASH = "3db6320aac829a3bef99dc8eaf84065e4884cfb2d468d99e5e23e44649555a8e0882a330d5d423f54da699ca053725a44805a186bf8dac5d5f3d7f38023e4ab0"

RPROVIDES:${PN} += "ocaml(Base64) ocaml(Base64__) ocaml(Base64__Unsafe) ocaml(Base64_rfc2045) ocaml-base64-devel ocaml-base64-devel(aarch-64) ocamlfind(base64) ocamlfind(base64.rfc2045) ocamlx(Base64) ocamlx(Base64__) ocamlx(Base64__Unsafe) ocamlx(Base64_rfc2045)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Buffer) ocaml(Stdlib__Bytes) ocaml(Stdlib__Char) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Sys) ocaml(Stdlib__Uchar) ocaml-base64 ocamlx(Stdlib) ocamlx(Stdlib__Array) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Bytes) ocamlx(Stdlib__Char) ocamlx(Stdlib__Format) ocamlx(Stdlib__String) ocamlx(Stdlib__Sys)"

inherit rpm
