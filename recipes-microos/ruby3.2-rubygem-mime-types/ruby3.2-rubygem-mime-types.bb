SUMMARY = "The mime-types library provides a library and registry for"
DESCRIPTION = "The mime-types library provides a library and registry for information about \
MIME content type definitions. It can be used to determine defined filename \
extensions for MIME types, or to use filename extensions to look up the likely \
MIME type definitions. \
Version 3.0 is a major release that requires Ruby 2.0 compatibility and \
removes \
deprecated functions. The columnar registry format introduced in 2.6 has been \
made the primary format; the registry data has been extracted from this \
library \
and put into {mime-types-data}[https://github.com/mime-types/mime-types-data]. \
Additionally, mime-types is now licensed exclusively under the MIT licence and \
there is a code of conduct in effect. There are a number of other smaller \
changes described in the History file."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "ruby3.2-rubygem-mime-types-3.4.1-1.10.aarch64.rpm"
RPM_HASH = "e377294339078040dcb6ab35ad5cdaeee6d986490c3df6d42e4e5b275f0631e8ea3d0c305b2b90c2c926504f1bdef08dfb84e5552cf8245476c2327f0de58591"

RPROVIDES:${PN} += "ruby3.2-rubygem-mime-types ruby3.2-rubygem-mime-types(aarch-64) rubygem(mime-types) rubygem(ruby:3.2.0:mime-types) rubygem(ruby:3.2.0:mime-types:3) rubygem(ruby:3.2.0:mime-types:3.4) rubygem(ruby:3.2.0:mime-types:3.4.1)"
RDEPENDS:${PN} += "ruby(abi) rubygem(ruby:3.2.0:mime-types-data:3)"

inherit rpm
