SUMMARY = "Daylight savings aware timezone library"
DESCRIPTION = "TZInfo provides daylight savings aware transformations between times in \
different time zones."
LICENSE = "MIT"

PV = "1.2.10"

RPM_NAME = "ruby3.2-rubygem-tzinfo-1.2-1.2.10-1.5.aarch64.rpm"
RPM_HASH = "9a94a3293ff2e13af6a10a65caf1adc59b3881bac4ead27965cef89106b89ab44d59eed37f8e4bae0b18c513c0c31def3e18d4983f0346b28dbcd8fd2a748596"

RPROVIDES:${PN} += "ruby3.2-rubygem-tzinfo-1.2 ruby3.2-rubygem-tzinfo-1.2(aarch-64) rubygem(ruby:3.2.0:tzinfo) rubygem(ruby:3.2.0:tzinfo:1) rubygem(ruby:3.2.0:tzinfo:1.2) rubygem(ruby:3.2.0:tzinfo:1.2.10) rubygem(tzinfo)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:thread_safe:0) timezone"

inherit rpm
