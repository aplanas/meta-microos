SUMMARY = "Data files for ocaml-camomile"
DESCRIPTION = "The ocaml-camomile-data package contains data files for developing \
applications that use ocaml-camomile."
LICENSE = "LGPL-2.0+"

PV = "1.0.2"

RPM_NAME = "ocaml-camomile-data-1.0.2-3.25.aarch64.rpm"
RPM_HASH = "4be75fa90c1288e726b8790ee75f3c9319682ffe22bb7456c9cbe5b2ac871f192de1ac2aed821f8391e83111e169e425ea31a459ec6b6159521699f4cf90eb87"

RPROVIDES:${PN} += "ocaml-camomile-data ocaml-camomile-data(aarch-64)"
RDEPENDS:${PN} += "ocaml-camomile"

inherit rpm
