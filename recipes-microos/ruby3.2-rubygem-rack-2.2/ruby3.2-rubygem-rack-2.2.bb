SUMMARY = "A modular Ruby webserver interface"
DESCRIPTION = "Rack provides a minimal, modular and adaptable interface for developing \
web applications in Ruby. By wrapping HTTP requests and responses in \
the simplest way possible, it unifies and distills the API for web \
servers, web frameworks, and software in between (the so-called \
middleware) into a single method call."
LICENSE = "MIT"

PV = "2.2.6.4"

RPM_NAME = "ruby3.2-rubygem-rack-2.2-2.2.6.4-1.2.aarch64.rpm"
RPM_HASH = "66207ce091e6102002346f3eb10b42309840e64af1426b2762aa445b034f5a486e93724914565755c9ec6d1b1809f339cda48ebae62fa5316f81678032bb04cd"

RPROVIDES:${PN} += "ruby3.2-rubygem-rack-2.2 ruby3.2-rubygem-rack-2.2(aarch-64) rubygem(rack) rubygem(ruby:3.2.0:rack) rubygem(ruby:3.2.0:rack:2) rubygem(ruby:3.2.0:rack:2.2) rubygem(ruby:3.2.0:rack:2.2.6)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) update-alternatives"

inherit rpm
