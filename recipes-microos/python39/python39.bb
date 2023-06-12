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

RPM_NAME = "python39-3.9.16-8.1.aarch64.rpm"
RPM_HASH = "ac23f25b4c94e418e09958a67f8752d5ed140cf8f5bd8ddee2c6457850ab3f134143478f2907a442301a5ba52186adfc4a64103701a79b9a8190c13a297033f1"

RPROVIDES:${PN} += "python39 python39(aarch-64) python39-readline python39-sqlite3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) python(abi) python39-base"

inherit rpm
