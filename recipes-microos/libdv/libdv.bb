SUMMARY = "The Quasar DV Codec"
DESCRIPTION = "The Quasar DV codec (libdv) is a software codec for DV video, the \
encoding format used by most digital camcorders, typically those that \
support the IEEE 1394 (FireWire or i.Link) interface. Libdv was \
developed according to the official standards for DV video: IEC 61834 \
and SMPTE 314M. \
 \
This package contains the encodedv, dubdv and dvconnect tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libdv-1.0.0-179.5.aarch64.rpm"
RPM_HASH = "51fad6b52ce16905bfa861030e12a239c98bcf9234a42ff77fbbc64dab7f517b485b8b95e83170363a2cd7b8be3bb1d2df9d1ad869bae1fd41a8028e5f11fb94"

RPROVIDES:${PN} += "libdv libdv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdv.so.4()(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit)"

inherit rpm
