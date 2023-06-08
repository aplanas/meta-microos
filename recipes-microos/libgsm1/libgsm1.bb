SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains the library for a GSM speech compressor. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
(residual pulse excitation/long term prediction) coding at 13 kbit/s. \
GSM 06.10 compresses frames of 160 13-bit samples (8 kHz sampling \
rate) into 260 bits."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libgsm1-1.0.22-1.2.aarch64.rpm"
RPM_HASH = "98ff6a285737b8981aa0b33d090baff520dc24f73951bec2cab9377c44828877a803d18347e5da754b5ce9bbfda2770e37d7284ef2d39ff0e5ecde0d5250d357"

RPROVIDES:${PN} += "libgsm.so.1()(64bit) libgsm1 libgsm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
