SUMMARY = "Development files for mimic (Mycroft's TTS engine)"
DESCRIPTION = "Mimic is a text-to-speech engine based on Carnegie Mellon \
University’s Flite (Festival-Lite) software. Mimic takes in text and \
reads it out loud to create a voice. \
 \
This package contains the headers and development libraries for mimic."
LICENSE = "BSD-3-Clause & MIT-CMU"

PV = "1.3.0.1"

RPM_NAME = "mimic-devel-1.3.0.1-2.3.aarch64.rpm"
RPM_HASH = "f4cac2ec736e664daaa9e7bbdce937c5e8a18fb4dc102e01eeb30fd71f0f41926d08032e5743497345b7f2e3ae198b7429f3bafe524814263f46b57de3e7c1db"

RPROVIDES:${PN} += "mimic-devel mimic-devel(aarch-64) pkgconfig(mimic)"
RDEPENDS:${PN} += "/usr/bin/pkg-config mimic pkgconfig(alsa) pkgconfig(libpcre2-8)"

inherit rpm
