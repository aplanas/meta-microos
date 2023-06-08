SUMMARY = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizing"
DESCRIPTION = "ruby_parser (RP) is a ruby parser written in pure ruby (utilizing \
racc--which does by default use a C extension). It outputs \
s-expressions which can be manipulated and converted back to ruby via \
the ruby2ruby gem. \
As an example: \
def conditional1 arg1 \
return 1 if arg1 == 0 \
return 0 \
end \
becomes: \
s(:defn, :conditional1, s(:args, :arg1), \
s(:if, \
s(:call, s(:lvar, :arg1), :==, s(:lit, 0)), \
s(:return, s(:lit, 1)), \
nil), \
s(:return, s(:lit, 0))) \
Tested against 801,039 files from the latest of all rubygems (as of 2013-05): \
* 1.8 parser is at 99.9739% accuracy, 3.651 sigma \
* 1.9 parser is at 99.9940% accuracy, 4.013 sigma \
* 2.0 parser is at 99.9939% accuracy, 4.008 sigma \
* 2.6 parser is at 99.9972% accuracy, 4.191 sigma \
* 3.0 parser has a 100% parse rate. \
* Tested against 2,672,412 unique ruby files across 167k gems. \
* As do all the others now, basically."
LICENSE = "MIT"

PV = "3.19.2"

RPM_NAME = "ruby3.2-rubygem-ruby_parser-3.19.2-1.4.aarch64.rpm"
RPM_HASH = "2a5f1b92fd9b4676aa16ea8871d43047d069c1b00c99d040094e3606b70eb5eab3c79ab01e0e3e595e2eff2eaf357b63e549a4b395e4f14155d4d368582d7550"

RPROVIDES:${PN} += "ruby3.2-rubygem-ruby_parser ruby3.2-rubygem-ruby_parser(aarch-64) rubygem(ruby:3.2.0:ruby_parser) rubygem(ruby:3.2.0:ruby_parser:3) rubygem(ruby:3.2.0:ruby_parser:3.19) rubygem(ruby:3.2.0:ruby_parser:3.19.2) rubygem(ruby_parser)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:sexp_processor:4) update-alternatives"

inherit rpm
