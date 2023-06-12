SUMMARY = "A fast and nimble PDF generator for Ruby"
DESCRIPTION = "Prawn is a fast, tiny, and nimble PDF generator for Ruby."
LICENSE = "Ruby & GPL-2.0-only & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-prawn-2.4.0-1.13.aarch64.rpm"
RPM_HASH = "754c370c52053b98608e54a592cade481938781c4140b84c6e40962392b32880a48f50b439b2e360acad706e8e94fef521442fc698dfc0381551fddcbfd83b34"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn \
ruby3.2-rubygem-prawn(aarch-64) \
rubygem(prawn) \
rubygem(ruby:3.2.0:prawn) \
rubygem(ruby:3.2.0:prawn:2) \
rubygem(ruby:3.2.0:prawn:2.4) \
rubygem(ruby:3.2.0:prawn:2.4.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:pdf-core:0.9) \
rubygem(ruby:3.2.0:ttfunk:1)"

inherit rpm
