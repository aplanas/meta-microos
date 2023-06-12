SUMMARY = "Converts HTML into Haml"
DESCRIPTION = "Converts HTML into Haml."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ruby3.2-rubygem-html2haml-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "d5e00b739fcf709b8ac19ddc64dc4813304efdd7e119b5fc9b4d40751f3d9f1fb1fe8b7bbc6a22ffa1a58a1ba82d77d5f36379d746e8e7616fdc33a603d1c65f"

RPROVIDES:${PN} += "ruby3.2-rubygem-html2haml \
ruby3.2-rubygem-html2haml(aarch-64) \
rubygem(html2haml) \
rubygem(ruby:3.2.0:html2haml) \
rubygem(ruby:3.2.0:html2haml:2) \
rubygem(ruby:3.2.0:html2haml:2.3) \
rubygem(ruby:3.2.0:html2haml:2.3.0)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ruby(abi) \
rubygem(ruby:3.2.0:erubis:2.7) \
rubygem(ruby:3.2.0:haml) \
rubygem(ruby:3.2.0:nokogiri) \
rubygem(ruby:3.2.0:ruby_parser:3) \
update-alternatives"

inherit rpm
