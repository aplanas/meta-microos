SUMMARY = "PHP Extension Module"
DESCRIPTION = "PHP's XSL extension implements the XSL (Extensible Stylesheet \
Language) standard, performing XSLT transformations using the libxslt \
library"
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-xsl-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "1b4f52dea764846110a5dab44a392cf9305611cc012cb4bf501a067fdd6818fd7c71b519fb9acdd38672e7c7d72bcb0b9217ccc23bd5d776855b3707b9506e3c"

RPROVIDES:${PN} += "config(php8-xsl) php-xsl php8-xsl php8-xsl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libexslt.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.13)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libxslt.so.1(LIBXML2_1.0.24)(64bit) php php-dom"

inherit rpm
