SUMMARY = "Memory Management Debugger"
DESCRIPTION = "Valgrind checks all memory operations in an application, like read, \
write, malloc, new, free, and delete. Valgrind can find uses of \
uninitialized memory, access to already freed memory, overflows, \
illegal stack operations, memory leaks, and any illegal \
new/malloc/free/delete commands. Another program in the package is \
'cachegrind,' a profiler based on the valgrind engine. \
 \
To use valgrind you should compile your application with '-g -O0' \
compiler options. Afterwards you can use it with: \
 \
valgrind --tool=memcheck --sloppy-malloc=yes --leak-check=yes \
--db-attach=yes my_application, for example. \
 \
More valgrind options can be listed via 'valgrind --help'. There is \
also complete documentation in the /usr/share/doc/packages/valgrind/ \
directory. A debugged application runs slower and needs much more \
memory, but is usually still usable. Valgrind is still in development, \
but it has been successfully used to optimize several KDE applications."
LICENSE = "GFDL-1.2-only & GPL-2.0-or-later"

PV = "3.21.0"

RPM_NAME = "valgrind-3.21.0-1.1.aarch64.rpm"
RPM_HASH = "1790ff4bbb0a0511197f2fc81e267c08f69fbcd0344a98233c8bf825af1a7898e1d710be6f175ba426af044f1fb839da4e261e7df017fb9df8303725e94871e5"

RPROVIDES:${PN} += "callgrind valgrind valgrind(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/perl glibc libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
