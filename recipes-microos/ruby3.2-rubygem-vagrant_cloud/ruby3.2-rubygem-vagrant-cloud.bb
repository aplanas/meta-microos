SUMMARY = "Ruby library for the HashiCorp Vagrant Cloud API"
DESCRIPTION = "Ruby library for the HashiCorp Vagrant Cloud API."
LICENSE = "MIT"

PV = "3.0.5"

RPM_NAME = "ruby3.2-rubygem-vagrant_cloud-3.0.5-2.9.aarch64.rpm"
RPM_HASH = "413289c2d6989badf0bb482c9e48e8172d0eec48857e808b7a4d6fa8fc555138463e6513365d92c4de63571e9cd9fe97d76b7ad8b47d086cc7e106af6449f341"

RPROVIDES:${PN} += "ruby3.2-rubygem-vagrant_cloud ruby3.2-rubygem-vagrant_cloud(aarch-64) rubygem(ruby:3.2.0:vagrant_cloud) rubygem(ruby:3.2.0:vagrant_cloud:3) rubygem(ruby:3.2.0:vagrant_cloud:3.0) rubygem(ruby:3.2.0:vagrant_cloud:3.0.5) rubygem(vagrant_cloud)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:excon:0) rubygem(ruby:3.2.0:log4r:1.1) rubygem(ruby:3.2.0:rexml:3.2)"

inherit rpm
