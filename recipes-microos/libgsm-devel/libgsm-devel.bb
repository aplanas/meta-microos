SUMMARY = "GSM 06.10 Lossy Speech Compressor Library and Utilities"
DESCRIPTION = "Contains the development kit for the libgsm speech compressor. \
 \
libgsm implements the European GSM 06.10 provisional standard for \
full-rate speech transcoding, prI-ETS 300 036, which uses RPE/LTP \
coding at 13 kbit/s. GSM 06.10 compresses frames of 160 13-bit \
samples (8 kHz sampling rate) into 260 bits. \
 \
This implementation turns frames of 160 16-bit linear samples into \
33-byte frames (1650 bytes/s) and has been verified against the ETSI \
standard test patterns."
LICENSE = "ISC"

PV = "1.0.22"

RPM_NAME = "libgsm-devel-1.0.22-1.2.aarch64.rpm"
RPM_HASH = "6fb7e8216a5e1479e8077146ad31da840a813a9fd5f0aee73555d49575d8238b551ebe322f47f9dca410b859b6ec760f9de493c75f23352baf578c0afa646898"

RPROVIDES:${PN} += "libgsm-devel libgsm-devel(aarch-64)"
RDEPENDS:${PN} += "libgsm1"

inherit rpm
