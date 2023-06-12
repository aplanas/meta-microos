SUMMARY = "Optimist is a commandline option parser for Ruby that just gets out"
DESCRIPTION = "Optimist is a commandline option parser for Ruby that just \
gets out of your way. One line of code per option is all you need to write. \
For that, you get a nice automatically-generated help page, robust option \
parsing, command subcompletion, and sensible defaults for everything you don't \
specify."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "ruby3.2-rubygem-optimist-3.0.1-1.16.aarch64.rpm"
RPM_HASH = "d083432b1c5605fa3ef71298e6eb4d9a18ae8102d6633ea0df2316803d29e401f153b9ee45ebbfd89276a9d5855bbbffa57ba3bfbd4cacb445cd3cf0955c3503"

RPROVIDES:${PN} += "ruby3.2-rubygem-optimist \
ruby3.2-rubygem-optimist(aarch-64) \
rubygem(optimist) \
rubygem(ruby:3.2.0:optimist) \
rubygem(ruby:3.2.0:optimist:3) \
rubygem(ruby:3.2.0:optimist:3.0) \
rubygem(ruby:3.2.0:optimist:3.0.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
