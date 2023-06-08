SUMMARY = "Ruby bindings for rpm (package manager)"
DESCRIPTION = "Ruby bindings for rpm. Almost a drop-in replacement for ruby-rpm. Uses FFI."
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "ruby3.2-rubygem-rpm-0.0.5-1.27.aarch64.rpm"
RPM_HASH = "bc01bd949ab4e9da83b27fe8bb36b3004c134c8cbe40b87ab816d6afffdf3a0834746984ce66eebe3d9417b536108ef44e60f6aef43e4506a3963808a052b188"

RPROVIDES:${PN} += "ruby3.2-rubygem-rpm ruby3.2-rubygem-rpm(aarch-64) rubygem(rpm) rubygem(ruby:3.2.0:rpm) rubygem(ruby:3.2.0:rpm:0) rubygem(ruby:3.2.0:rpm:0.0) rubygem(ruby:3.2.0:rpm:0.0.5)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:ffi)"

inherit rpm
