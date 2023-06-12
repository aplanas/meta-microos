SUMMARY = "mime-types-data provides a registry for information about MIME media"
DESCRIPTION = "mime-types-data provides a registry for information about MIME media type \
definitions. It can be used with the Ruby mime-types library or other software \
to determine defined filename extensions for MIME types, or to use filename \
extensions to look up the likely MIME type definitions."
LICENSE = "MIT"

PV = "3.2022.0105"

RPM_NAME = "ruby3.2-rubygem-mime-types-data-3.2022.0105-1.10.aarch64.rpm"
RPM_HASH = "5b1bdb6b622f6d4b433cadbc9bcadde2fb196254e8d7fa27d0c92b4ae0527c3737cb13e7c050ff14c67880ee8d3979682930c3aa094cda8d3dbb8aae99b519cd"

RPROVIDES:${PN} += "ruby3.2-rubygem-mime-types-data \
ruby3.2-rubygem-mime-types-data(aarch-64) \
rubygem(mime-types-data) \
rubygem(ruby:3.2.0:mime-types-data) \
rubygem(ruby:3.2.0:mime-types-data:3) \
rubygem(ruby:3.2.0:mime-types-data:3.2022) \
rubygem(ruby:3.2.0:mime-types-data:3.2022.0105)"
RDEPENDS:${PN} += "ruby(abi)"

inherit rpm
