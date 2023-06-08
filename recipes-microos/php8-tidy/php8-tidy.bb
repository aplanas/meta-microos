SUMMARY = "PHP binding for the Tidy HTML cleaner"
DESCRIPTION = "Tidy is an extension based on Libtidy (http://tidy.sourceforge.net) and allows \
a PHP developer to clean, repair, and traverse HTML, XHTML, and XML \
documents -- including ones with embedded scripting languages such as \
PHP or ASP within them using OO constructs."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-tidy-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "53b69e5e883660c0c5323118289a63a8d5de7ac8b4e2f0b64890afeaf604eef86f158f225af7467e00a97b756bcea150a06153f420ecf2512c8549203af4d8f3"

RPROVIDES:${PN} += "config(php8-tidy) php-tidy php8-tidy php8-tidy(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtidy.so.58()(64bit) php"

inherit rpm
