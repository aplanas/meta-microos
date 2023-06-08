SUMMARY = "Streaming XML reader extension for PHP"
DESCRIPTION = "The XMLReader extension is an XML Pull parser. The reader acts as a \
cursor going forward on the document stream and stopping at each node \
on the way."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-xmlreader-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "30aac2324defaf9e8f1ad8e75ec3a941592cf4e6b41b93465ae8b6764f3dba0aca0ec57a3a009c02ac538a699f37ee90fc6ef13fb68e0d3d0c8cd10bd01efc59"

RPROVIDES:${PN} += "config(php8-xmlreader) php-xmlreader php8-xmlreader php8-xmlreader(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit) libxml2.so.2(LIBXML2_2.6.28)(64bit) php php-dom"

inherit rpm
