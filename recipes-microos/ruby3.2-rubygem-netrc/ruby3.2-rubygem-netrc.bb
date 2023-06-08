SUMMARY = "Library to read and write netrc files"
DESCRIPTION = "This library can read and update netrc files, preserving formatting including \
comments and whitespace."
LICENSE = "MIT"

PV = "0.11.0"

RPM_NAME = "ruby3.2-rubygem-netrc-0.11.0-1.29.aarch64.rpm"
RPM_HASH = "26cb5e0da22fbd1ae2e7408f88ab93002a17c5455b22bbd75365847271ec133f41846c415d4590efd1dfd81a04e9d69863f4707215eae8789979fe53d3e74362"

RPROVIDES:${PN} += "ruby3.2-rubygem-netrc ruby3.2-rubygem-netrc(aarch-64) rubygem(netrc) rubygem(ruby:3.2.0:netrc) rubygem(ruby:3.2.0:netrc:0) rubygem(ruby:3.2.0:netrc:0.11) rubygem(ruby:3.2.0:netrc:0.11.0)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
