SUMMARY = "Listen to file modifications"
DESCRIPTION = "The Listen gem listens to file modifications and notifies you about the \
changes. Works everywhere!."
LICENSE = "MIT"

PV = "3.7.1"

RPM_NAME = "ruby3.2-rubygem-listen-3.7.1-1.11.aarch64.rpm"
RPM_HASH = "32b29f7ef69d8ae0846afcd8338b27da454b6201ca042d0f47f8ebd02f7788adf1de0eefcd4929df2d65a9a2f7271ca98716dc2ec9a919d6c1b2a558dfb0d39e"

RPROVIDES:${PN} += "ruby3.2-rubygem-listen ruby3.2-rubygem-listen(aarch-64) rubygem(listen) rubygem(ruby:3.2.0:listen) rubygem(ruby:3.2.0:listen:3) rubygem(ruby:3.2.0:listen:3.7) rubygem(ruby:3.2.0:listen:3.7.1)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:rb-fsevent) rubygem(ruby:3.2.0:rb-fsevent:0) rubygem(ruby:3.2.0:rb-inotify) rubygem(ruby:3.2.0:rb-inotify:0) update-alternatives"

inherit rpm
