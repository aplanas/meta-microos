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

PV = "3.11.2"

RPM_NAME = "python311-3.11.2-1.2.aarch64.rpm"
RPM_HASH = "a9d3fc7e327480f621d6cb8f5f619d8fd8929f6f14ca56cb9a4745e0ff544e97ce15d187418ed54be9a0409b8034357e77d7da69c590db449a967f736d3e099e"

RPROVIDES:${PN} += "python311 python311(aarch-64) python311-readline python311-sqlite3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) python(abi) python311-base"

inherit rpm
