SUMMARY = "Small Device C Compiler"
DESCRIPTION = "SDCC is a C compiler for 8051 class and similar microcontrollers. \
The package includes the compiler, assemblers and linkers, a device \
simulator and a core library. The processors supported (to a varying \
degree) include the 8051, ds390, z80, hc08, and PIC. \
 \
This package contains sources for the C library and other files for \
development."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "sdcc-libc-sources-4.2.0-1.3.noarch.rpm"
RPM_HASH = "1b381f80cf60ff9191567785915a2116fc802de1f98e5eeebaaeb4a95619ab9c667efd27449002f741aa2047b8b86de141a33b766108603024fa85bc2200e02c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdcc-libc-sources"
RDEPENDS:${PN} += "/bin/sh sdcc"

inherit rpm
