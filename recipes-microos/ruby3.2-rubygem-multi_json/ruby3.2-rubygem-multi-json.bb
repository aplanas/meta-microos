SUMMARY = "A common interface to multiple JSON libraries"
DESCRIPTION = "A common interface to multiple JSON libraries, including Oj, Yajl, the JSON \
gem (with C-extensions), the pure-Ruby JSON gem, NSJSONSerialization, gson.rb, \
JrJackson, and OkJson."
LICENSE = "MIT"

PV = "1.15.0"

RPM_NAME = "ruby3.2-rubygem-multi_json-1.15.0-1.15.aarch64.rpm"
RPM_HASH = "27c5b4552befe875036dbe8ed873b39ef62458bdf7d5f78fe4c0195ddb097662f4a344ff4203ff784457337e8d33344aa2135fedaf6f5b68274cda0f72df066c"

RPROVIDES:${PN} += "ruby3.2-rubygem-multi_json ruby3.2-rubygem-multi_json(aarch-64) rubygem(multi_json) rubygem(ruby:3.2.0:multi_json) rubygem(ruby:3.2.0:multi_json:1) rubygem(ruby:3.2.0:multi_json:1.15) rubygem(ruby:3.2.0:multi_json:1.15.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
