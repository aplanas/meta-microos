SUMMARY = "An Encode::Encoding subclass that detects the encoding of data"
DESCRIPTION = "This Perl module is an Encode::Encoding subclass that uses \
Encode::Detect::Detector to determine the charset of the input data and then \
decodes it using the encoder of the detected charset. \
 \
It is similar to Encode::Guess, but does not require the configuration of a set \
of expected encodings. Like Encode::Guess, it only supports decoding--it cannot \
encode. \
 \
Authors: \
-------- \
    John Gardiner Myers <jgmyers@proofpoint.com>"
LICENSE = "MPL-1.1"

PV = "1.01"

RPM_NAME = "perl-Encode-Detect-1.01-21.36.aarch64.rpm"
RPM_HASH = "bce45459779092fdeaf20bc2470144ec7c47cdedbfcdc556c2ad741c2431af00f22c2f5348c1f5a6c36692951d56bb9ad470cb628e7e476abd5f7d2263294f2a"

RPROVIDES:${PN} += "perl(Encode::Detect) \
perl(Encode::Detect::Detector) \
perl-Encode-Detect \
perl-Encode-Detect(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
