SUMMARY = "Flog reports the most tortured code in an easy to read pain report"
DESCRIPTION = "Flog reports the most tortured code in an easy to read pain \
report. The higher the score, the more pain the code is in."
LICENSE = "MIT"

PV = "4.6.6"

RPM_NAME = "ruby3.2-rubygem-flog-4.6.6-1.6.aarch64.rpm"
RPM_HASH = "a6edf4512176ab8a489e869365045e715544105a67375d464d9fd9ab9c159daa2de3ba4dbb820f37b655361adb9406cca39a8d94ffe4f542685a0a8f9ae7d094"

RPROVIDES:${PN} += "ruby3.2-rubygem-flog ruby3.2-rubygem-flog(aarch-64) rubygem(flog) rubygem(ruby:3.2.0:flog) rubygem(ruby:3.2.0:flog:4) rubygem(ruby:3.2.0:flog:4.6) rubygem(ruby:3.2.0:flog:4.6.6)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:path_expander:1) rubygem(ruby:3.2.0:ruby_parser) rubygem(ruby:3.2.0:ruby_parser:3) rubygem(ruby:3.2.0:sexp_processor:4) update-alternatives"

inherit rpm
