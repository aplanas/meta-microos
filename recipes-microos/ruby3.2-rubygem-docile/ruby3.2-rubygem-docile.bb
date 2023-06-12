SUMMARY = "Ruby gem to treat Ruby objects as a domain-specific language"
DESCRIPTION = "Docile treats the methods of a given ruby object as a DSL (domain specific \
language) within a given block. \
Killer feature: you can also reference methods, instance variables, and local \
variables from the original (non-DSL) context within the block. \
Docile releases follow Semantic Versioning as defined at semver.org."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "ruby3.2-rubygem-docile-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "74deda764f2432a1b3b3a42f9716e7d5d9a7f7e08ff49bb582282220aff012e24c1f24728c0e5b9924acde04aa8d2170cd36588529f78562c68aa7eeae2d380f"

RPROVIDES:${PN} += "ruby3.2-rubygem-docile \
ruby3.2-rubygem-docile(aarch-64) \
rubygem(docile) \
rubygem(ruby:3.2.0:docile) \
rubygem(ruby:3.2.0:docile:1) \
rubygem(ruby:3.2.0:docile:1.4) \
rubygem(ruby:3.2.0:docile:1.4.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
