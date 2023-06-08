SUMMARY = "Zabbix web frontend (php)"
DESCRIPTION = "The Zabbix PHP frontend allows access via standard web browsers. \
 \
NOTE: You still have to install the PHP package which contains your db driver!"
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-ui-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "0aede48da2cb7f1a8d4acd44bda134f22554a0aaa055f6a8b3792320b3e2d67f59bca87a06e1eb48463da40009fe4e4b638bb39f364479d675ca1edc6bf708c6"

RPROVIDES:${PN} += "config(zabbix-ui) zabbix-ui zabbix-ui(aarch-64)"
RDEPENDS:${PN} += "/bin/bash apache2 php8 php8-bcmath php8-ctype php8-gd php8-gettext php8-ldap php8-mbstring php8-sockets php8-xmlreader php8-xmlwriter"

inherit rpm
