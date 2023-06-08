SUMMARY = "Ruby module for interaction with D-Bus"
DESCRIPTION = "Pure Ruby module for interaction with D-Bus IPC system."
LICENSE = "LGPL-2.1-only"

PV = "0.21.0"

RPM_NAME = "ruby3.2-rubygem-ruby-dbus-0.21.0-1.2.aarch64.rpm"
RPM_HASH = "0f153f802b196ef944c76a67879c23ca02c40c07bed317401cd73b5626aa99644f34998c22f6186b75d4f2ce0d1ca964ba4680a4845758e26bb87e397da090e9"

RPROVIDES:${PN} += "ruby-dbus ruby3.2-rubygem-ruby-dbus ruby3.2-rubygem-ruby-dbus(aarch-64) rubygem(ruby-dbus) rubygem(ruby:3.2.0:ruby-dbus) rubygem(ruby:3.2.0:ruby-dbus:0) rubygem(ruby:3.2.0:ruby-dbus:0.21) rubygem(ruby:3.2.0:ruby-dbus:0.21.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:rexml)"

inherit rpm
