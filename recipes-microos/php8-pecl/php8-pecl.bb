SUMMARY = "PHP Extension Community Library"
DESCRIPTION = "PECL is a repository for PHP Extensions, providing a directory of \
all known extensions and hosting facilities for downloading and \
development of PHP extensions. \
 \
See https://pecl.php.net for more details."
LICENSE = "BSD-2-Clause"

PV = "1.10.21"

RPM_NAME = "php8-pecl-1.10.21-1.6.noarch.rpm"
RPM_HASH = "b0bbfacec4493a9235b919ccdd08720f208e5b6193573b128a571fd25252e7ca37bc099fc0276b818be2b94bf12889dc6bd6b17f6f7950d34c32ce625ad05a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pecl php8-pecl"
RDEPENDS:${PN} += "/bin/sh autoconf automake gcc-c++ libtool php8-pear"

inherit rpm
