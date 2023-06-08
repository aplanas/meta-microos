SUMMARY = "Python Interpreter"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
If you want to install third party modules using distutils, you need to \
install python-devel package."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "3de57c937a7f5431b42427a6871336bc5a91d2bb893ba3711f3a0373969bf283f172965fbbbd5a96b9dadd80b5227a9bc52d9b8ea4f1581c9b4f807c5399304b"

RPROVIDES:${PN} += "python python(aarch-64) python2 python2_split_startup"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.1.1()(64bit) libcrypto.so.1.1(OPENSSL_1_1_0)(64bit) libdb-4.8.so()(64bit) libpython2.7.so.1.0()(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) libssl.so.1.1()(64bit) libssl.so.1.1(OPENSSL_1_1_0)(64bit) python-base"

inherit rpm
