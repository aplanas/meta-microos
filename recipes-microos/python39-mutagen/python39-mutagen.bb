SUMMARY = "Python module to Handle Audio Metadata"
DESCRIPTION = "Mutagen is a Python module to handle audio metadata. It supports FLAC, \
M4A, MP3, Ogg FLAC, Ogg Speex, Ogg Theora, Ogg Vorbis, True Audio, and \
WavPack audio files. All versions of ID3v2 are supported, and all \
standard ID3v2.4 frames are parsed. It can read Xing headers to \
accurately calculate the bitrate and length of MP3s. ID3 and APEv2 tags \
can be edited regardless of their audio format. It can also manipulate \
Ogg streams on an individual packet/page level."
LICENSE = "GPL-2.0-or-later"

PV = "1.46.0"

RPM_NAME = "python39-mutagen-1.46.0-1.4.noarch.rpm"
RPM_HASH = "cbb830cfb3ae6e4f9dfd557a6bb94feaabbb4d364a269fad147f7053453ac26f6b9977f7df48421e652b7db562e1a831804875601024094272dc5d2cc3f2917f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mutagen) python39-mutagen python3dist(mutagen)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
