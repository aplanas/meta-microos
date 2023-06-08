SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.19.9"

RPM_NAME = "go1.19-1.19.9-1.1.aarch64.rpm"
RPM_HASH = "ce7f07bc647a3030f0176bee94e6466fd9dad92899fcc5537fee4e19711e2de921097b5ed48b7002888b5948911413bdd2e36e1ce1c63ee703900f2d5f336721"

RPROVIDES:${PN} += "config(go1.19) go go-devel go-devel-static go1.19 go1.19(aarch-64) golang(API)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env gcc libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
