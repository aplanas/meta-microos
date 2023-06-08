SUMMARY = "Airbrussh pretties up your SSHKit and Capistrano output"
DESCRIPTION = "A replacement log formatter for SSHKit that makes Capistrano output much \
easier on the eyes. Just add Airbrussh to your Capfile and enjoy concise, \
useful log output that is easy to read."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "ruby3.2-rubygem-airbrussh-1.4.1-1.6.aarch64.rpm"
RPM_HASH = "cbb33c6ccc008758e3641ff5b8aa669eebcc27f73a0f0c43256931371b16f7e7ba1e020a3e11e3e243698405f5d8bfef90d80426c2fa1ceff4edc80097471a0d"

RPROVIDES:${PN} += "ruby3.2-rubygem-airbrussh ruby3.2-rubygem-airbrussh(aarch-64) rubygem(airbrussh) rubygem(ruby:3.2.0:airbrussh) rubygem(ruby:3.2.0:airbrussh:1) rubygem(ruby:3.2.0:airbrussh:1.4) rubygem(ruby:3.2.0:airbrussh:1.4.1)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:sshkit)"

inherit rpm
