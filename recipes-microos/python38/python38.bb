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

PV = "3.8.16"

RPM_NAME = "python38-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "7f0648c9dab99516cb87cfa4655286d5ec8cea3c6ceec81c53d10201b6f39ecf1e0ff89cbfbe2ec3572c54225d1c999ff022b2e350c1f2b16c39f8fa0c3e6c2b"

RPROVIDES:${PN} += "python38 python38(aarch-64) python38-readline python38-sqlite3"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsqlite3.so.0()(64bit) python(abi) python38-base"

inherit rpm
