SUMMARY = "An audio library based on libsndfile, CFFI and NumPy"
DESCRIPTION = "PySoundFile is an audio library based on libsndfile, CFFI and NumPy. \
Full documentation is available on http://pysoundfile.readthedocs.org/. \
 \
PySoundFile can read and write sound files. File reading/writing is \
supported through libsndfile, which itself is accessed through CFFI, \
a foreign function interface for Python calling C code. PySoundFile \
represents audio data as NumPy arrays."
LICENSE = "BSD-3-Clause"

PV = "0.12.1"

RPM_NAME = "python39-SoundFile-0.12.1-1.2.noarch.rpm"
RPM_HASH = "d88a93aa3b83d52c995d5100f9af794ce4e96320c30053ba7e4942633b5358fd1f5957c503a12208b4ec7c44b33ee778b9de2da88be4fbf676e9d2ada855ec78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(soundfile) python39-PySoundFile python39-SoundFile python39-soundfile python3dist(soundfile)"
RDEPENDS:${PN} += "libsndfile1 python(abi) python39-cffi"

inherit rpm
