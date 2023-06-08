SUMMARY = "Python binding for libsass"
DESCRIPTION = "A straightforward binding of libsass for Python. Compile Sass/SCSS in Python \
with no Ruby stack at all!"
LICENSE = "MIT"

PV = "0.22.0"

RPM_NAME = "python39-libsass-0.22.0-1.3.aarch64.rpm"
RPM_HASH = "bcf89e13d26097eeb6bf82ec0504b8590b31c166b9f35ab70a5f4682bc687c7372dc04777e59b76b098b041e28748820845977ea82695097ba5e1cbadd02db4c"

RPROVIDES:${PN} += "python3.9dist(libsass) python39-libsass python39-libsass(aarch-64) python3dist(libsass)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsass-3.6.5.so.1()(64bit) python(abi) python39-setuptools update-alternatives"

inherit rpm
