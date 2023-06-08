SUMMARY = "Headers for the Z39.50 protocol library"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "libyaz-devel-5.34.0-1.3.aarch64.rpm"
RPM_HASH = "52a6e399c946b367592c6ddc2463329e8ae5311e84e3dee0620fec76bcdac603a5a1b8ff96a512cb9154da15e885dc16398bb150e0e9fb76fca15d2e475a2c31"

RPROVIDES:${PN} += "libyaz-devel libyaz-devel(aarch-64) pkgconfig(yaz) pkgconfig(yaz-icu) pkgconfig(yaz-server)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/tclsh libicu-devel libxslt-devel libyaz5 openssl-devel pkgconfig(icu-i18n) pkgconfig(libexslt) pkgconfig(yaz) tcpd-devel yaz"

inherit rpm
