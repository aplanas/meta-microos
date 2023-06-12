SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "MIT & PHP-3.01"

PV = "8.1.19"

RPM_NAME = "php8-xmlreader-8.1.19-2.2.aarch64.rpm"
RPM_HASH = "23a46db918f9da000ce2cf48f88a5a173ecfea4b1a7a0e2844b9fc0c2d28400441f05c5df99d3c3fb3457d5a7716772f4ac5debf7f0f94f32fa505563ab42cbd"

RPROVIDES:${PN} += "config(php8-xmlreader) php-xmlreader php8-xmlreader php8-xmlreader(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit) libxml2.so.2(LIBXML2_2.6.28)(64bit) php php-dom"

inherit rpm
