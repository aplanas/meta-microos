SUMMARY = "Icinga Web 2 PHP library"
DESCRIPTION = "Icinga Web 2 PHP library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "php-Icinga-2.11.4-2.1.noarch.rpm"
RPM_HASH = "c38614b12e717c88710ba99cbbdabe791e5e6f025aa5d72dad161e2368c7af8a693dae88ba1b7435afbab3dc4c0707b7959cfd182469d8eda7e0ee3f0eb8be09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-Icinga"
RDEPENDS:${PN} += "/bin/sh \
icingaweb2-vendor-zf1 \
php \
php-ctype \
php-curl \
php-dom \
php-fileinfo \
php-gd \
php-gettext \
php-imagick \
php-intl \
php-json \
php-mbstring \
php-openssl \
php-pdo \
php-posix \
php-xml"

inherit rpm
