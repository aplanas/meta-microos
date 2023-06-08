SUMMARY = "The CoffeeScript Compiler"
DESCRIPTION = "CoffeeScript is a little language that compiles into JavaScript. \
Underneath all of those embarrassing braces and semicolons, \
JavaScript has always had a gorgeous object model at its heart. \
CoffeeScript is an attempt to expose the good parts of JavaScript \
in a simple way."
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "ruby3.2-rubygem-coffee-script-source-1.12.2-1.28.aarch64.rpm"
RPM_HASH = "b72adc9fb32d4b469c74f9e5caf4dfc02df144ff7acaad45b9886259080ba27dbc06ae42b48ce673332435eb5f03a56f0aa27b3ad435f4d2650a7e556065a5dc"

RPROVIDES:${PN} += "ruby3.2-rubygem-coffee-script-source ruby3.2-rubygem-coffee-script-source(aarch-64) rubygem(coffee-script-source) rubygem(ruby:3.2.0:coffee-script-source) rubygem(ruby:3.2.0:coffee-script-source:1) rubygem(ruby:3.2.0:coffee-script-source:1.12) rubygem(ruby:3.2.0:coffee-script-source:1.12.2)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
