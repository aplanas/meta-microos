SUMMARY = "Header files for libradcli"
DESCRIPTION = "This package contains libraries and header files for developing applications \
that use libradcli."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "radcli-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "18b6f22e74447079b5c9e646705f849cad0e0a199baea54f1e5dd8a72a9b0c6fd48635dfd4693e2abcbf863498c78073f9985201b5619bdf4c772a5ad2b752ce"

RPROVIDES:${PN} += "pkgconfig(radcli) \
radcli-devel \
radcli-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libradcli5 \
pkgconfig(gnutls) \
pkgconfig(nettle)"

inherit rpm
