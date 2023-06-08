SUMMARY = "Library containing the definition of S-expressions and some base converters"
DESCRIPTION = "Library containing the definition of S-expressions and some base converters."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "ocaml-sexplib0-0.15.1-1.3.aarch64.rpm"
RPM_HASH = "1769b27e02f4a0c2cdb1a5bef6bf2f874f751a082c01d08f9dd4c34a96cf977ccf8198dde86bcf965b8c10654e7a0b4f5d43948ae92bedf05adc7ed6982048ea"

RPROVIDES:${PN} += "ocaml-sexplib0 ocaml-sexplib0(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
