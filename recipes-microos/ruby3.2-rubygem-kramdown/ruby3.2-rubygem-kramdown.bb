SUMMARY = "kramdown is a fast, pure-Ruby Markdown-superset converter"
DESCRIPTION = "kramdown is yet-another-markdown-parser but fast, pure Ruby, \
using a strict syntax definition and supporting several common extensions."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "ruby3.2-rubygem-kramdown-2.4.0-1.9.aarch64.rpm"
RPM_HASH = "89a6798423993b72b0cf70699f019f43f5fdf93e84db8901a247032fae1c5ea46990651bde1db64d631936fb32394e339368617fcacb71e7e8b40753a2d4aeff"

RPROVIDES:${PN} += "ruby3.2-rubygem-kramdown ruby3.2-rubygem-kramdown(aarch-64) rubygem(kramdown) rubygem(ruby:3.2.0:kramdown) rubygem(ruby:3.2.0:kramdown:2) rubygem(ruby:3.2.0:kramdown:2.4) rubygem(ruby:3.2.0:kramdown:2.4.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:rexml) update-alternatives"

inherit rpm
