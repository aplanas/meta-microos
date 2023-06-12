SUMMARY = "Abstract types for logic programming"
DESCRIPTION = "Define types with optional constraints for use within axiom and other \
libraries."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "ruby3.2-rubygem-axiom-types-0.1.1-1.31.aarch64.rpm"
RPM_HASH = "16f0f135deb618c506f0c3784c3da51fe749984048e723a6971ad5690101d48df41e3bed26b4b630619b71d294cf9543446d7cc4181d170bbfd05d8b853c203e"

RPROVIDES:${PN} += "ruby3.2-rubygem-axiom-types \
ruby3.2-rubygem-axiom-types(aarch-64) \
rubygem(axiom-types) \
rubygem(ruby:3.2.0:axiom-types) \
rubygem(ruby:3.2.0:axiom-types:0) \
rubygem(ruby:3.2.0:axiom-types:0.1) \
rubygem(ruby:3.2.0:axiom-types:0.1.1)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:descendants_tracker:0.0) \
rubygem(ruby:3.2.0:ice_nine:0.11) \
rubygem(ruby:3.2.0:thread_safe) \
rubygem(ruby:3.2.0:thread_safe:0)"

inherit rpm
