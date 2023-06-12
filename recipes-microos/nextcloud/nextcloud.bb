SUMMARY = "File hosting service"
DESCRIPTION = "Nextcloud is a suite of client-server software for creating file \
hosting services and using them."
LICENSE = "AGPL-3.0-only"

PV = "25.0.7"

RPM_NAME = "nextcloud-25.0.7-1.1.noarch.rpm"
RPM_HASH = "a26241b87337d955c0a4924616952c753dd7eba8f5a4e476ac43fc9f15548ba6ca022a9d541a099e03ca1ef3b0a59422da5a633f7caf4e60148bd442a02817bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(nextcloud) nextcloud"
RDEPENDS:${PN} += "/bin/sh cron curl libxml2-2 mariadb php-bz2 php-ctype php-curl php-dom php-fileinfo php-ftp php-gd php-iconv php-intl php-json php-ldap php-mbstring php-mysql php-opcache php-openssl php-pear php-posix php-xmlreader php-xmlwriter php-zip php-zlib systemd"

inherit rpm
