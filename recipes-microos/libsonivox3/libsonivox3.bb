SUMMARY = "Fork of the AOSP 'platform_external_sonivox' project"
DESCRIPTION = "Sonivox is a fork of the Android Open Source Project 'platform_external_sonivox' \
including a CMake based build system to be used not on Android, but on any other \
Operating System. \
 \
This is a Wave Table synthesizer, not using external soundfont files but \
embedded samples instead. It is also a real time GM synthesizer. \
It may be indicated in projects for small embedded devices. There is neither \
MIDI input nor Audio output facilities included in the library. You need to \
provide your own input/output."
LICENSE = "Apache-2.0"

PV = "3.6.11"

RPM_NAME = "libsonivox3-3.6.11-1.3.aarch64.rpm"
RPM_HASH = "5732cf1e92d416c494909b56fc4ecc23835309beb2ab5a79265db063642445964af26d17000779b70da96ae28bfe407cf1c9c400b36e5445f98ee9024c95b373"

RPROVIDES:${PN} += "libsonivox.so.3()(64bit) libsonivox3 libsonivox3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
