SUMMARY = "PHP Archive extension for PHP"
DESCRIPTION = "The phar extension provides a way to put entire PHP applications into \
a single file called a 'phar' (PHP Archive) for distribution and \
installation. \
 \
In addition, the phar extension also provides a file-format \
abstraction method for creating and manipulating tar and zip files \
through the PharData class, much as PDO provides a unified interface \
for accessing different databases. Phar also can convert between tar, \
zip and phar file formats."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-phar-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "fa15f278901b0c73c3325bf4677624b16ab9f80329a04f0cb5845afe80ed5bb4f6e235f9186e75e2b62c5afe42f3ef761e4aff5117323730098cde51713857ca"

RPROVIDES:${PN} += "config(php8-phar) php-phar php8-phar php8-phar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) php php-zlib"

inherit rpm
