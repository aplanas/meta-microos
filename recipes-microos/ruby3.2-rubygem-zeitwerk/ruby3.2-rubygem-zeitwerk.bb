SUMMARY = "Efficient and thread-safe constant autoloader"
DESCRIPTION = "Zeitwerk implements constant autoloading with Ruby semantics. Each gem \
and application may have their own independent autoloader, with its own \
configuration, inflector, and logger. Supports autoloading, \
reloading, and eager loading."
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "ruby3.2-rubygem-zeitwerk-2.6.6-1.3.aarch64.rpm"
RPM_HASH = "e7c3f58c7230f38deb165ced9a0fb5ff8d4812032a9a1f5352b7d4786cc1fb8df95cb8d626e7657c6b39fe5de0b485a2d6b16ef4e57b715db234cf7d235baa99"

RPROVIDES:${PN} += "ruby3.2-rubygem-zeitwerk ruby3.2-rubygem-zeitwerk(aarch-64) rubygem(ruby:3.2.0:zeitwerk) rubygem(ruby:3.2.0:zeitwerk:2) rubygem(ruby:3.2.0:zeitwerk:2.6) rubygem(ruby:3.2.0:zeitwerk:2.6.6) rubygem(zeitwerk)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
