SUMMARY = "Dependency Management for PHP"
DESCRIPTION = "Composer is a dependency manager tracking local dependencies of your projects \
and libraries."
LICENSE = "MIT"

PV = "2.5.5"

RPM_NAME = "php-composer2-2.5.5-1.1.noarch.rpm"
RPM_HASH = "b0dce57f254cb8ef57832aeee134335a1bb247ec33e17ac953a7a708e6bb1526816c64bccd70410a595e195d801b977b77de02d19daef1ee4437ffdfe76432ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "composer \
php-composer \
php-composer2 \
php7-composer"
RDEPENDS:${PN} += "/bin/sh \
php \
php-curl \
php-json \
php-mbstring \
php-openssl \
php-phar \
php-zip \
php-zlib \
update-alternatives"

inherit rpm
