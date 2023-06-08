SUMMARY = "A collection of text algorithms"
DESCRIPTION = "A collection of text algorithms: Levenshtein, Soundex, Metaphone, Double \
Metaphone, Porter Stemming."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "ruby3.2-rubygem-text-1.3.1-1.31.aarch64.rpm"
RPM_HASH = "b8b2393e2f53706c3210fd3dc28e2aec2e8928ff203be2fbb5c587749ea4b781bc255d849842db88797abbded99f6a59962dee20192dfc6dca2dc90bfe1a1033"

RPROVIDES:${PN} += "ruby3.2-rubygem-text ruby3.2-rubygem-text(aarch-64) rubygem(ruby:3.2.0:text) rubygem(ruby:3.2.0:text:1) rubygem(ruby:3.2.0:text:1.3) rubygem(ruby:3.2.0:text:1.3.1) rubygem(text)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
