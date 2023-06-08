SUMMARY = "A fast and nimble PDF generator for Ruby"
DESCRIPTION = "Prawn is a fast, tiny, and nimble PDF generator for Ruby."
LICENSE = "Ruby | GPL-2.0-or-later"

PV = "0.8.4"

RPM_NAME = "ruby3.2-rubygem-prawn-core-0.8.4-1.15.aarch64.rpm"
RPM_HASH = "b8605603d3033b4e117a78ff9b17e5096f667bc9cca1c3a557bff808e80cf26e7548aec3e512fd7acb51d77d4babc8a9c18081ada9f1d1e5c9d9acbf1df5fcd3"

RPROVIDES:${PN} += "ruby3.2-rubygem-prawn-core ruby3.2-rubygem-prawn-core(aarch-64) rubygem(prawn-core) rubygem(ruby:3.2.0:prawn-core) rubygem(ruby:3.2.0:prawn-core:0) rubygem(ruby:3.2.0:prawn-core:0.8) rubygem(ruby:3.2.0:prawn-core:0.8.4)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
