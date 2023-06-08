SUMMARY = "Icinga Web 2 PHP library"
DESCRIPTION = "Icinga Web 2 PHP library."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "php-Icinga-2.11.4-1.1.noarch.rpm"
RPM_HASH = "5900316b9b3a09c7373773aa788ec802285c1c054785abb865770af556c73c0e991653e0a1cb9dd5d9314c11b81e434f058e24e6a54ab226e746fe74dc24b663"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-Icinga"
RDEPENDS:${PN} += "/bin/sh icingaweb2-vendor-zf1 php php-ctype php-curl php-dom php-fileinfo php-gd php-gettext php-imagick php-intl php-json php-mbstring php-openssl php-pdo php-posix php-xml"

inherit rpm
