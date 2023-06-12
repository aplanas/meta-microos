SUMMARY = "Implementation of the SASL framework and a few common SASL mechanisms"
DESCRIPTION = "GNU SASL is an implementation of the Simple Authentication and \
Security Layer framework and a few common SASL mechanisms. SASL is \
used by network servers (e.g., IMAP, SMTP) to request authentication \
from clients, and in clients to authenticate against servers."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libgsasl-devel-1.10.0-6.1.aarch64.rpm"
RPM_HASH = "fd4bb2a0db21ce8a5d2042db13c8dfb55cb33efe089714b5600969fbbb00ed8774f417eee05be04e207d277e9c9cbe240a25f40335d5b3c8292b9b50f9eab916"

RPROVIDES:${PN} += "libgsasl-devel libgsasl-devel(aarch-64) pkgconfig(libgsasl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgsasl7 pkgconfig(krb5-gssapi) pkgconfig(libgcrypt) pkgconfig(libidn) pkgconfig(libntlm)"

inherit rpm
