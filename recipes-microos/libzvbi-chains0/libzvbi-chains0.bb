SUMMARY = "VBI Decoding Library"
DESCRIPTION = "VBI stands for Vertical Blanking Interval, a gap between the image data \
transmitted in an analog video signal. This gap is used to transmit AM \
modulated data for various data services like Teletext and Closed \
Caption. \
 \
The zvbi library provides routines to read from raw VBI sampling \
devices, to demodulate raw to sliced VBI data, and to interpret the \
data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.41"

RPM_NAME = "libzvbi-chains0-0.2.41-2.1.aarch64.rpm"
RPM_HASH = "1613146121ea126170242c1c502c9cd0878c8780001eb2735cd74bb8c09302e143552642e677d3c800328e96a7b7056dd1453ef6cddc97670b36763afaff3965"

RPROVIDES:${PN} += "libzvbi-chains.so.0()(64bit) libzvbi-chains0 libzvbi-chains0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
