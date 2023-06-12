SUMMARY = "Icinga CLI"
DESCRIPTION = "Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingacli-2.11.4-2.1.noarch.rpm"
RPM_HASH = "cf3093eb197457bce311bf0b99cdbce6c109ccf5d282be6771fa8ab80e9a24bc34f3f93b040c31dc5deef85aa0146cc4f4c7142eb176d64cf1f69209cd685ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingacli \
icingaweb2-icingacli"
RDEPENDS:${PN} += "/usr/bin/php \
bash-completion \
icinga-l10n \
icinga-php-library \
icinga-php-thirdparty \
icingaweb2-common \
php \
php-Icinga"

inherit rpm
