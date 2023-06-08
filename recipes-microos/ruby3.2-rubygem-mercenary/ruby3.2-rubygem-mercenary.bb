SUMMARY = "Lightweight and flexible library for writing command-line apps in"
DESCRIPTION = "Lightweight and flexible library for writing command-line apps in Ruby."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ruby3.2-rubygem-mercenary-0.4.0-1.17.aarch64.rpm"
RPM_HASH = "4fc2009d4f8c2f982ac4a5781754fb03557415bf4a8ffcbd79ccefb96ddf1aec39aeeefcc82590b081e9451afc4001bebe0dbd86e03a94edb1f1707c08c8bd58"

RPROVIDES:${PN} += "ruby3.2-rubygem-mercenary ruby3.2-rubygem-mercenary(aarch-64) rubygem(mercenary) rubygem(ruby:3.2.0:mercenary) rubygem(ruby:3.2.0:mercenary:0) rubygem(ruby:3.2.0:mercenary:0.4) rubygem(ruby:3.2.0:mercenary:0.4.0)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/ruby.ruby3.2 ruby(abi)"

inherit rpm
