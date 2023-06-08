SUMMARY = "Python bindings for Xiphorg's Ogg Vorbis, Opus and FLAC"
DESCRIPTION = "PyOgg provides bindings for Xiph.org's OGG Vorbis, OGG Opus and FLAC \
audio file formats."
LICENSE = "BSD-3-Clause"

PV = "0.6.14a1"

RPM_NAME = "python310-PyOgg-0.6.14a1-1.4.noarch.rpm"
RPM_HASH = "b647863c884999da31ba3b262c51db940939c26be9b2e154093d0fdf5e5cbdbbd8016dafcd176c4127c20ec5b3cb36de1638a304f88068cd940f7e571daacaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOgg python3.10dist(pyogg) python310-PyOgg python3dist(pyogg)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
