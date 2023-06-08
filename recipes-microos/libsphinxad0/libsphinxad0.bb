SUMMARY = "Sphinxbase speech recognizer library"
DESCRIPTION = "CMU Sphinx toolkit is a speech recognition tool and has a number of packages for \
different tasks and applications."
LICENSE = "BSD-2-Clause & MIT"

PV = "0.8"

RPM_NAME = "libsphinxad0-0.8-6.6.aarch64.rpm"
RPM_HASH = "6c221614218ba8c9238702b905653c6e09d16e98c15295d141fa4eaae13f1321dffb18a8225461af20c9012f9721fd41eacea0dec6d0c253a24022146443e9de"

RPROVIDES:${PN} += "libsphinxad.so.0()(64bit) libsphinxad0 libsphinxad0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libsphinxbase.so.1()(64bit)"

inherit rpm
