SUMMARY = "Launchy is helper class for launching cross-platform applications in"
DESCRIPTION = "Launchy is helper class for launching cross-platform applications in a fire \
and forget manner. There are application concepts (browser, email client, etc) \
that are common across all platforms, and they may be launched differently on \
each platform. Launchy is here to make a common approach to launching external \
applications from within ruby programs."
LICENSE = "ISC"

PV = "2.5.0"

RPM_NAME = "ruby3.2-rubygem-launchy-2.5.0-1.17.aarch64.rpm"
RPM_HASH = "5adea436fa5f310d1c660fbe863c3b195e4a5be2ab64ea81dd10a951ae7a2cf6e275abedb0010a13fccbb05f2dee894759e194ad8de4012f91b9f00de5fdd15d"

RPROVIDES:${PN} += "ruby3.2-rubygem-launchy ruby3.2-rubygem-launchy(aarch-64) rubygem(launchy) rubygem(ruby:3.2.0:launchy) rubygem(ruby:3.2.0:launchy:2) rubygem(ruby:3.2.0:launchy:2.5) rubygem(ruby:3.2.0:launchy:2.5.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:addressable:2) update-alternatives"

inherit rpm
