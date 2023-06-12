SUMMARY = "A set of Rails responders to dry up your application"
DESCRIPTION = "A set of Rails responders to dry up your application."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "ruby3.2-rubygem-responders-3.0.1-1.15.aarch64.rpm"
RPM_HASH = "00197e8b47ea661185ddad67815e8bd977905bbb9b76d9fb4441372e0e3afeab06b2b5412b473ced6bb3575418476c76b09e7430e0050d0a426e5d8cfe3950a4"

RPROVIDES:${PN} += "ruby3.2-rubygem-responders \
ruby3.2-rubygem-responders(aarch-64) \
rubygem(responders) \
rubygem(ruby:3.2.0:responders) \
rubygem(ruby:3.2.0:responders:3) \
rubygem(ruby:3.2.0:responders:3.0) \
rubygem(ruby:3.2.0:responders:3.0.1)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:actionpack) \
rubygem(ruby:3.2.0:railties)"

inherit rpm
