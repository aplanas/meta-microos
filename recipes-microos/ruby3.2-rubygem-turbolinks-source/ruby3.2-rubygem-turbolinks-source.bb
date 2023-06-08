SUMMARY = "Turbolinks JavaScript assets"
DESCRIPTION = "Turbolinks JavaScript assets."
LICENSE = "MIT"

PV = "5.2.0"

RPM_NAME = "ruby3.2-rubygem-turbolinks-source-5.2.0-1.21.aarch64.rpm"
RPM_HASH = "a20ad08183cf100041a93822c266561217d969530b6286f81e9007efb726ceeca01e47371ff4170ed23f029597f461738756c7114e265e483bfbef44565c264e"

RPROVIDES:${PN} += "ruby3.2-rubygem-turbolinks-source ruby3.2-rubygem-turbolinks-source(aarch-64) rubygem(ruby:3.2.0:turbolinks-source) rubygem(ruby:3.2.0:turbolinks-source:5) rubygem(ruby:3.2.0:turbolinks-source:5.2) rubygem(ruby:3.2.0:turbolinks-source:5.2.0) rubygem(turbolinks-source)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
