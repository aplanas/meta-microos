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

PV = "3.20.0"

RPM_NAME = "valgrind-3.20.0-3.1.aarch64.rpm"
RPM_HASH = "9bd6bbbf8f17f96cdd56d4688d6f58789f82ebfc1eb74344188d8af165a48c02c736fce75aaa8b1b91fc3e0d5e37591f7ff299804578ad1835e1e307c33839cd"

RPROVIDES:${PN} += "callgrind valgrind valgrind(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl glibc libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
