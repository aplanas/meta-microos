SUMMARY = "Mozilla's CA cert bundle in PEM format"
DESCRIPTION = "Mozilla::CA provides a copy of Mozilla's bundle of Certificate Authority \
certificates in a form that can be consumed by modules and libraries based \
on OpenSSL. \
 \
The module provide a single function: \
 \
* SSL_ca_file() \
 \
Returns the absolute path to the Mozilla's CA cert bundle PEM file."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "20221114"

RPM_NAME = "perl-Mozilla-CA-20221114-1.1.noarch.rpm"
RPM_HASH = "fb11111f74dfba23c09117c15ac6d76a5ed0ea9406b197833066a94be888ee13a668d6af0b4464d191e76cab7917fd2f828b1a99527f365fbb43b7df08cfa4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mozilla::CA) perl-Mozilla-CA"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
