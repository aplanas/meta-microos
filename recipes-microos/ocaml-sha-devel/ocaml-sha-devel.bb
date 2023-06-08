SUMMARY = "Development files for ocaml-sha"
DESCRIPTION = "The ocaml-sha-devel package contains libraries and signature files for \
developing applications that use ocaml-sha."
LICENSE = "ISC"

PV = "1.15.2"

RPM_NAME = "ocaml-sha-devel-1.15.2-1.11.aarch64.rpm"
RPM_HASH = "597e46620adad4734ee4587e2a3949036b95e8dfc1b11416be561320c0d812b990d4cc4733d216422963ef9b55bb64ecbd9ccdea2b8f06e7390a3a9ea77462d1"

RPROVIDES:${PN} += "ocaml(Sha1) ocaml(Sha256) ocaml(Sha512) ocaml-sha-devel ocaml-sha-devel(aarch-64) ocamlfind(sha) ocamlx(Sha1) ocamlx(Sha256) ocamlx(Sha512)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) ocaml(CamlinternalFormatBasics) ocaml(Stdlib) ocaml(Stdlib__Bigarray) ocaml(Stdlib__Bytes) ocaml(Stdlib__Complex) ocaml(Stdlib__Either) ocaml(Stdlib__Seq) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml-sha ocamlfind(stdlib-shims) ocamlx(Stdlib) ocamlx(Stdlib__Bytes)"

inherit rpm
