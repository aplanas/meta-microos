SUMMARY = "An implementation of the SMTP protocol"
DESCRIPTION = "Provides an implementation of the SMTP protocol using PEAR's Net_Socket class."
LICENSE = "BSD-2-Clause"

PV = "1.10.1"

RPM_NAME = "php-pear-Net_SMTP-1.10.1-1.2.noarch.rpm"
RPM_HASH = "f599e136f5c3626371c5e6c4e22cc1a0bb94937aaf51b0610b8fd9765a8c69cd3c2c8089187c091690460afc9054f964bcb3134cde202a9fe75ab21522851e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear(Net_SMTP) \
php-pear-Net_SMTP \
php5-pear-Net_SMTP \
php7-pear-Net_SMTP"
RDEPENDS:${PN} += "/bin/sh \
php-pear \
php-pear(Net_Socket)"

inherit rpm
