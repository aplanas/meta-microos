SUMMARY = "A basic Sass converter for Jekyll"
DESCRIPTION = "A basic Sass converter for Jekyll."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "ruby3.2-rubygem-jekyll-sass-converter-2.2.0-1.9.aarch64.rpm"
RPM_HASH = "27661cc6ff2233669d5bf5a9744032972ba1d6c447af7c2224b0220091a0354ae0c493926843ba2df4f809fa756006b236a6a45eece38cad2c8bd9a8d5b0470c"

RPROVIDES:${PN} += "ruby3.2-rubygem-jekyll-sass-converter \
ruby3.2-rubygem-jekyll-sass-converter(aarch-64) \
rubygem(jekyll-sass-converter) \
rubygem(ruby:3.2.0:jekyll-sass-converter) \
rubygem(ruby:3.2.0:jekyll-sass-converter:2) \
rubygem(ruby:3.2.0:jekyll-sass-converter:2.2) \
rubygem(ruby:3.2.0:jekyll-sass-converter:2.2.0)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:sassc)"

inherit rpm
