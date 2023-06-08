SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "25.0.6"

RPM_NAME = "nextcloud-25.0.6-1.1.noarch.rpm"
RPM_HASH = "bac5439fc69094bc50e2e1cdcc95bc21cc68874281d6682a4da233e8afdc78e4c0d1f556f88977190f410af711d91a7c67a76fdf1e3e5900b909db841a181d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(nextcloud) nextcloud"
RDEPENDS:${PN} += "/bin/sh cron curl libxml2-2 mariadb php-bz2 php-ctype php-curl php-dom php-fileinfo php-ftp php-gd php-iconv php-intl php-json php-ldap php-mbstring php-mysql php-opcache php-openssl php-pear php-posix php-xmlreader php-xmlwriter php-zip php-zlib systemd"

inherit rpm
