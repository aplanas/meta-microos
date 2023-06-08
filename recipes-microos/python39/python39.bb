SUMMARY = "Python 3 Interpreter"
DESCRIPTION = "Python 3 is modern interpreted, object-oriented programming language, \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python3-doc \
package. \
 \
This package supplies rich command line features provided by readline, \
and sqlite3 support for the interpreter core, thus forming a so called \
'extended' runtime. \
Installing 'python3' is sufficient for the vast majority of usecases. \
In addition, recommended packages provide UI toolkit support (python3-curses, \
python3-tk), legacy UNIX database bindings (python3-dbm), and the IDLE \
development environment (python3-idle)."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "d5b21e7ade48e85ec8bfd2ae55722233e1efb3078071395d57c3ab0260075c426c05cd2c35a7d4d0ccfae1bf09496e38dec2d54630402bf101c5e03f2404d073"

RPROVIDES:${PN} += "python39 python39(aarch-64) python39-readline python39-sqlite3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) python(abi) python39-base"

inherit rpm
