SUMMARY = "Module for the 'fog' gem to support libvirt"
DESCRIPTION = "This library can be used as a module for 'fog' or as standalone libvirt \
provider."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "ruby3.2-rubygem-fog-libvirt-0.10.1-1.3.aarch64.rpm"
RPM_HASH = "54e679982d1b620437f760426fd63648d0c853e3a42b95ec5b0391765678dcf5a0990a412e4ec40ed0495a7883c4959ae74b579f5b015bb9f9794678b996120c"

RPROVIDES:${PN} += "ruby3.2-rubygem-fog-libvirt \
ruby3.2-rubygem-fog-libvirt(aarch-64) \
rubygem(fog-libvirt) \
rubygem(ruby:3.2.0:fog-libvirt) \
rubygem(ruby:3.2.0:fog-libvirt:0) \
rubygem(ruby:3.2.0:fog-libvirt:0.10) \
rubygem(ruby:3.2.0:fog-libvirt:0.10.1)"
RDEPENDS:${PN} += "ruby(abi) \
rubygem(ruby:3.2.0:fog-core) \
rubygem(ruby:3.2.0:fog-json) \
rubygem(ruby:3.2.0:fog-xml:0.1) \
rubygem(ruby:3.2.0:json) \
rubygem(ruby:3.2.0:ruby-libvirt)"

inherit rpm
