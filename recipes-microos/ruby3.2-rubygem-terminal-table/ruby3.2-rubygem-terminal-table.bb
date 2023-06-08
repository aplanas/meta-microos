SUMMARY = "Simple, feature rich ascii table generation library"
DESCRIPTION = "Simple, feature rich ascii table generation library."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "ruby3.2-rubygem-terminal-table-3.0.2-1.9.aarch64.rpm"
RPM_HASH = "4d5d89b83f1c738458284b745c4263415f80c62fee4554efc82d08a2ce354be903ced5d13e02b3a964af63bd654b9da148cb167580a4ae7ed406219f1e054169"

RPROVIDES:${PN} += "ruby3.2-rubygem-terminal-table ruby3.2-rubygem-terminal-table(aarch-64) rubygem(ruby:3.2.0:terminal-table) rubygem(ruby:3.2.0:terminal-table:3) rubygem(ruby:3.2.0:terminal-table:3.0) rubygem(ruby:3.2.0:terminal-table:3.0.2) rubygem(terminal-table)"
RDEPENDS:${PN} += "/usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:unicode-display_width)"

inherit rpm
