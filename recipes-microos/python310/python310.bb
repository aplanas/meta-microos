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

PV = "3.10.10"

RPM_NAME = "python310-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "8f1c38f5d53cbb6b6e1952bb4eef6420007b2870854bc26112386a612f2fce6af2a325f833071e99326b0d975b6e8ac02fba73453c50f44136812de6fdcb2a62"

RPROVIDES:${PN} += "python3 python3-readline python3-sqlite3 python310 python310(aarch-64) python310-readline python310-sqlite3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) python(abi) python310-base"

inherit rpm
