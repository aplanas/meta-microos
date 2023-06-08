SUMMARY = "Icinga Web 2"
DESCRIPTION = "Icinga Web 2 is the monitoring web interface for icinga2. \
 \
It comes with a completely new design and many user-friendly enhancements to \
find the relevant information even faster."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-2.11.4-1.1.noarch.rpm"
RPM_HASH = "589557b6200a52ff317a133523b5104c172446b147453fd0f1c4c15f36fd8dfaec307d5a1cf39476e8b84b3820fcb827d6280ff7285c8fbb0160c9f49b781c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(icingaweb2) icingaweb2"
RDEPENDS:${PN} += "/bin/sh apache2 icinga-l10n icinga-php-library icinga-php-thirdparty icingacli icingaweb2-common icingaweb2-vendor-HTMLPurifier icingaweb2-vendor-JShrink icingaweb2-vendor-Parsedown icingaweb2-vendor-dompdf icingaweb2-vendor-lessphp mod_php_any php php-Icinga php-ldap php-mysql php-pgsql pwdutils"

inherit rpm
