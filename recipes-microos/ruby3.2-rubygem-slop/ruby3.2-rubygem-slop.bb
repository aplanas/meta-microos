SUMMARY = "Simple Lightweight Option Parsing"
DESCRIPTION = "A DSL for gathering options and parsing command line flags."
LICENSE = "MIT"

PV = "4.9.3"

RPM_NAME = "ruby3.2-rubygem-slop-4.9.3-1.5.aarch64.rpm"
RPM_HASH = "9484700689167f620ff0e931cf3381f169ff3c48940cd591b26077f83f479e4754b91c2acb7e1a5406e678134e4361355cf0fb24e9633e3b16514808f966f098"

RPROVIDES:${PN} += "ruby3.2-rubygem-slop ruby3.2-rubygem-slop(aarch-64) rubygem(ruby:3.2.0:slop) rubygem(ruby:3.2.0:slop:4) rubygem(ruby:3.2.0:slop:4.9) rubygem(ruby:3.2.0:slop:4.9.3) rubygem(slop)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
