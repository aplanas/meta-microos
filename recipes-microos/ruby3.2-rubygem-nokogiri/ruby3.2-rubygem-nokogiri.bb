SUMMARY = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML"
DESCRIPTION = "Nokogiri (鋸) makes it easy and painless to work with XML and HTML from Ruby. \
It provides a \
sensible, easy-to-understand API for reading, writing, modifying, and querying \
documents. It is \
fast and standards-compliant by relying on native parsers like libxml2 (C) and \
xerces (Java)."
LICENSE = "MIT"

PV = "1.13.9"

RPM_NAME = "ruby3.2-rubygem-nokogiri-1.13.9-1.8.aarch64.rpm"
RPM_HASH = "93d982ce90af6b34adc2800f16b2512de1a98d0e55a28877d887776dd060d42e0a9d1358219207d40005fcac4fc6c22483fcc136b68922dd4b9b00e5c4fb4f83"

RPROVIDES:${PN} += "ruby3.2-rubygem-nokogiri \
ruby3.2-rubygem-nokogiri(aarch-64) \
rubygem(nokogiri) \
rubygem(ruby:3.2.0:nokogiri) \
rubygem(ruby:3.2.0:nokogiri:1) \
rubygem(ruby:3.2.0:nokogiri:1.13) \
rubygem(ruby:3.2.0:nokogiri:1.13.9)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/ruby.ruby3.2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexslt.so.0()(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.12)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.20)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.24)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.13)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libz.so.1()(64bit) \
ruby(abi) \
rubygem(ruby:3.2.0:racc:1) \
update-alternatives"

inherit rpm
