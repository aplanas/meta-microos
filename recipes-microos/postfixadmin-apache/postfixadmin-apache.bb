SUMMARY = "Postfixadmin - Apache configuration"
DESCRIPTION = "PostfixAdmin is a PHP based application that handles Postfix Style Virtual \
Domains and Users that are stored in MySQL or PostgreSQL. \
 \
This package holds the apache configuration."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.13"

RPM_NAME = "postfixadmin-apache-3.3.13-1.2.noarch.rpm"
RPM_HASH = "e1a40d8670db5b6b72069b66a997319d1c76e802b2184b056e5bdbcf68edad8604e6ac0f8fce07d32283f10d62ab46dac92de9e3ccbb0d9fa9cf3fd3c07e2fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(postfixadmin-apache) postfixadmin-apache"
RDEPENDS:${PN} += "apache2"

inherit rpm
