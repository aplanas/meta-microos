SUMMARY = "A library that provides parsing and seeking of Ogg-files"
DESCRIPTION = "liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the \
Ogg based Annodex formats, thus allows parsing (though not decoding) \
of these files. For getting decoding and encoding functionality you \
will require in addition libspeex, libvorbis, libtheora, and \
libannodex respectively."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "oggz-tools-1.1.1-15.28.aarch64.rpm"
RPM_HASH = "207f2ad0576b8627c700cf1dfe68f7bfb36bb4e1752c507831478440040b57579cb516ef4511c07b7abb5867f6ba3fb15e04b2b8b73a5b799a0faf766388140b"

RPROVIDES:${PN} += "oggz-tools oggz-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libogg.so.0()(64bit) liboggz.so.2()(64bit) liboggz.so.2(liboggz.so.0.2)(64bit)"

inherit rpm
