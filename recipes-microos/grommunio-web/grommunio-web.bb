SUMMARY = "Web client for access to grommunio features from the web"
DESCRIPTION = "A web client written in PHP that makes use of HTML5, JSON and ExtJS \
to allow users to make full use of the grommunio \
through a web browser."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-only & LGPL-2.1-only & MIT"

PV = "3.2.43.7ebf7d9"

RPM_NAME = "grommunio-web-3.2.43.7ebf7d9-1.1.noarch.rpm"
RPM_HASH = "748dd399581bbb3f020b84b072ef141f6ca38b36f7b5c9a9d9919f0d8b791c6f4d74f4e4537e99c84f984d7172d064b60ddc0c48cb39534000c4bd21f07d4787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(grommunio-web) \
grommunio-web"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
gromox \
mapi-header-php \
php8-bcmath \
php8-ctype \
php8-curl \
php8-gd \
php8-gettext \
php8-iconv \
php8-mbstring \
php8-openssl \
php8-sodium \
php8-sqlite \
php8-sysvshm \
php8-zip \
php8-zlib \
user(groweb)"

inherit rpm
