SUMMARY = "Nextview EPG Decoder and Browser"
DESCRIPTION = "In this software package, find a decoder for Nextview--an electronic TV \
program guide for the analog domain (as opposed to the various digital \
EPGs that come with most digital broadcasts). It allows you to decode \
and browse TV program listings for most of the major networks in \
Germany, Austria, France, and Switzerland. \
 \
Currently, Nextview EPG is transmitted by: * In Germany and Austria: \
   Kabel1, 3Sat, RTL-II, EuroNews (coverage: apx. 31 networks) \
 \
* In Switzerland: SF1, TSR1, TSI1, EuroNews, 3sat, Kabel1 (coverage: \
   apx. 37 networks) \
 \
* In France: Canal+, M6 (coverage: 8 networks) \
 \
* In Turkey: TRT-1 (coverage: 17 networks)"
LICENSE = "GPL-2.0-or-later"

PV = "2.8.1"

RPM_NAME = "nxtvepg-2.8.1-26.12.aarch64.rpm"
RPM_HASH = "c3e7abc81492ae965f85cd2940fbe83a2678e2750a212cef513d461b10358197d067a10333d4a0ed5c9569936cb1afb5b7e6b2680c8ca3a7621339213bbf908b"

RPROVIDES:${PN} += "nxtvepg nxtvepg(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXmu.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit)"

inherit rpm
