SUMMARY = "Icinga CLI"
DESCRIPTION = "Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingacli-2.11.4-1.1.noarch.rpm"
RPM_HASH = "2731515c237a4c9b5f738a8cbe56d68fd566e1041350a22b5d6e79934195dee1c000ca8e41c7eefa5b12859a6f1a322d6daad1714db0bd503b8601e5bf856cd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingacli icingaweb2-icingacli"
RDEPENDS:${PN} += "/usr/bin/php bash-completion icinga-l10n icinga-php-library icinga-php-thirdparty icingaweb2-common php php-Icinga"

inherit rpm
