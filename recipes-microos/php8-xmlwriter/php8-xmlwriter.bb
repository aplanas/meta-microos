SUMMARY = "Streaming-based XML writer extension for PHP"
DESCRIPTION = "XMLWriter wraps the libxml xmlWriter API. Represents a writer that \
provides a non-cached, forward-only means of generating streams or \
files containing XML data."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-xmlwriter-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "747895ff350df2c8e4260cb3f17779d92c5c8fbce9d43616804e1f29fee9f92b415a1429d4f929a075388995954662f80c888b1481791c305d346ef91af28417"

RPROVIDES:${PN} += "config(php8-xmlwriter) php-xmlwriter php8-xmlwriter php8-xmlwriter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.6.7)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) php"

inherit rpm
