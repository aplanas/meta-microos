SUMMARY = "A collection of tools for music analysis"
DESCRIPTION = "A python module to access the aubio library functions. \
 \
aubio is a library to label music and sounds. It listens to audio signals and attempts to detect events. For instance, when a drum is hit, at which frequency is a note, or at what tempo is a rhythmic melody. \
 \
Its features include segmenting a sound file before each of its attacks, performing pitch detection, tapping the beat and producing midi streams from live audio."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.9"

RPM_NAME = "python311-aubio-0.4.9-9.1.aarch64.rpm"
RPM_HASH = "ce4c0e113749649f72e7306aa909b9aa808b019e23a086df647d536b0eef1edd917fe5dc58ffbb1b36e92237d9fe3241ca269d7932b91677dacc6e21eb4fb28b"

RPROVIDES:${PN} += "python3.11dist(aubio) python311-aubio python311-aubio(aarch-64) python3dist(aubio)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-numpy update-alternatives"

inherit rpm
