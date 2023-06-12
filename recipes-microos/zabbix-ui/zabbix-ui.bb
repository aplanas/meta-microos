SUMMARY = "Zabbix web frontend (php)"
DESCRIPTION = "The Zabbix PHP frontend allows access via standard web browsers. \
 \
NOTE: You still have to install the PHP package which contains your db driver!"
LICENSE = "GPL-2.0-or-later"

PV = "6.0.17"

RPM_NAME = "zabbix-ui-6.0.17-1.1.aarch64.rpm"
RPM_HASH = "efb742d8c558d5a841b858a25ed83b9850d81d2cc3cf5150e393c8c8264ff9f74a180dbcb5734539f54da3cdda99cecd4ed668a229a773fae75840ef887dd1da"

RPROVIDES:${PN} += "config(zabbix-ui) zabbix-ui zabbix-ui(aarch-64)"
RDEPENDS:${PN} += "/bin/bash apache2 php8 php8-bcmath php8-ctype php8-gd php8-gettext php8-ldap php8-mbstring php8-sockets php8-xmlreader php8-xmlwriter"

inherit rpm
