SUMMARY = "Tiny library enabling you to define abstract methods in Ruby classes"
DESCRIPTION = "Abstract Method is a tiny library enabling you to define abstract methods in \
Ruby classes and modules."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "ruby3.2-rubygem-abstract_method-1.2.1-2.29.aarch64.rpm"
RPM_HASH = "a02ce9e483f51e21eb36e8605165e635ae72ba0b112da04840629bf45f3a03670b28d009c4125d8bc4330f7eed4ddb8f80c3c47b0aa259920309218e9d4bb745"

RPROVIDES:${PN} += "ruby3.2-rubygem-abstract_method ruby3.2-rubygem-abstract_method(aarch-64) rubygem(abstract_method) rubygem(ruby:3.2.0:abstract_method) rubygem(ruby:3.2.0:abstract_method:1) rubygem(ruby:3.2.0:abstract_method:1.2) rubygem(ruby:3.2.0:abstract_method:1.2.1)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
