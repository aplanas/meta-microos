SUMMARY = "MIDI instrument patch library"
DESCRIPTION = "libInstPatch stands for lib-Instrument-Patch and is a library for processing \
digital sample based MIDI instrument 'patch' files. The types of files \
libInstPatch supports are used for creating instrument sounds for wavetable \
synthesis. libInstPatch provides an object framework (based on GObject) to load \
patch files into, which can then be edited, converted, compressed and saved. \
 \
This package contains the library of libinstpatch."
LICENSE = "LGPL-2.1-only"

PV = "1.1.6"

RPM_NAME = "libinstpatch-1_0-2-1.1.6-2.8.aarch64.rpm"
RPM_HASH = "bd164e1e32623684b9b88d60135f6f50a164af67a85eb04bc571a47674ac66d9dce8e67140075f485417aa7a7456afebdb022243534d6900e544334eab7a2236"

RPROVIDES:${PN} += "libinstpatch-1.0.so.2()(64bit) libinstpatch-1_0-2 libinstpatch-1_0-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsndfile.so.1()(64bit) libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
