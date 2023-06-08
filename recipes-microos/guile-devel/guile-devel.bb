SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.8"

RPM_NAME = "guile-devel-3.0.8-4.7.aarch64.rpm"
RPM_HASH = "da14b11f36ae4984f7bde462623bae1f1d163d8d19e115684aa17a8d8c4b6dc37823f9e601ec1ef96d036a17ec881da7c1736645cb16a6e79a7d4b5e2604fdb8"

RPROVIDES:${PN} += "guile-devel guile-devel(aarch-64) pkgconfig(guile-3.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config gmp-devel guile libffi-devel libguile-3_0-1 libunistring-devel ncurses-devel pkgconfig(bdw-gc) readline-devel"

inherit rpm
