SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g., IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl-devel-1.10.0-5.2.aarch64.rpm"
RPM_HASH = "fb4d6d9953731bb3388797f051e7587c258a8b175f1d8c24edafd2373a3b9392047c7ab843bbda76031a1984cb1627357f4755ed36b2724728ab2e6670e90d91"

RPROVIDES:${PN} += "libgsasl-devel libgsasl-devel(aarch-64) pkgconfig(libgsasl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgsasl7 pkgconfig(krb5-gssapi) pkgconfig(libgcrypt) pkgconfig(libidn) pkgconfig(libntlm)"

inherit rpm
