SUMMARY = "CFA (Config Files API) provides an easy way to create models on top"
DESCRIPTION = "Library offering separation of parsing and file access from the rest of the \
logic for managing configuraton files. It has built-in support for parsing \
using augeas lenses and also for working with files directly in memory."
LICENSE = "LGPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "ruby3.2-rubygem-cfa-1.0.2-1.17.aarch64.rpm"
RPM_HASH = "28b36c56c07ff1a6f7e70bf05e4be4938732622241fcb2479d7165495d5afe50c0c05ec3e3d4c6cb3effd0a7e987f3883ee29f4ed5fcb7201e7ecbff9ca2c4d4"

RPROVIDES:${PN} += "ruby3.2-rubygem-cfa ruby3.2-rubygem-cfa(aarch-64) rubygem(cfa) rubygem(ruby:3.2.0:cfa) rubygem(ruby:3.2.0:cfa:1) rubygem(ruby:3.2.0:cfa:1.0) rubygem(ruby:3.2.0:cfa:1.0.2)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:ruby-augeas)"

inherit rpm
