SUMMARY = "Generate rpm specfiles from gems"
DESCRIPTION = "Generate source rpms and rpm spec files from a Ruby Gem. \
The spec file tries to follow the gem as closely as possible"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "ruby3.2-rubygem-gem2rpm-0.10.1-20.3.aarch64.rpm"
RPM_HASH = "9fddffac20908f88be7131b9b62d3822186d084ddcf49e2234b5945be9c7e7e4f41ed89b73aa8e7c870e5f0140409c6421de3e5f40cb7767c870e28369cf9bed"

RPROVIDES:${PN} += "ruby3.2-rubygem-gem2rpm ruby3.2-rubygem-gem2rpm(aarch-64) rubygem(gem2rpm) rubygem(ruby:3.2.0:gem2rpm) rubygem(ruby:3.2.0:gem2rpm:0) rubygem(ruby:3.2.0:gem2rpm:0.10) rubygem(ruby:3.2.0:gem2rpm:0.10.1)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) update-alternatives"

inherit rpm
