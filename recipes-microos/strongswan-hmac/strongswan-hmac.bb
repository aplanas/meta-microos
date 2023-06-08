SUMMARY = "HMAC files for FIPS-140-2 integrity in strongSwan"
DESCRIPTION = "The package provides HMAC hash files for FIPS-140-2 integrity checks, \
a config file disabling alternative algorithm implementations and a \
_fipscheck helper script preforming the integrity checks before e.g. \
'ipsec start' action is executed, when FIPS-140-2 compliant operation \
mode is enabled."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.10"

RPM_NAME = "strongswan-hmac-5.9.10-2.1.aarch64.rpm"
RPM_HASH = "080d7ba9f5f0d1a8d6de534a12b287ca8b8f07f698099a1afc3b3b5017dddc67c506c88750146a2eaa7165a7651d52b6a7899d8fc5e8365dc21bfd32864582df"

RPROVIDES:${PN} += "config(strongswan-hmac) strongswan-hmac strongswan-hmac(aarch-64)"
RDEPENDS:${PN} += "/bin/bash fipscheck strongswan-ipsec strongswan-libs0"

inherit rpm
