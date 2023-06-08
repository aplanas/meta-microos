SUMMARY = "X font server"
DESCRIPTION = "xfs is the X Window System font server. It supplies fonts to X Window \
System display servers."
LICENSE = "HPND"

PV = "1.2.1"

RPM_NAME = "xfs-1.2.1-2.4.aarch64.rpm"
RPM_HASH = "576477a4b18d7703b7f48572a0df4058116d3445e7c12c100b6cd5d372d67e596c489d059bda0bce7e14246a1eabf2a6efd7bdf2d8e3216056b2d7d99659de39"

RPROVIDES:${PN} += "xfs xfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXfont2.so.2()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
