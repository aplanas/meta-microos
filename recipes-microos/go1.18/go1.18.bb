SUMMARY = "A compiled, garbage-collected, concurrent programming language"
DESCRIPTION = "Go is an expressive, concurrent, garbage collected systems programming language \
that is type safe and memory safe. It has pointers but no pointer arithmetic. \
Go has fast builds, clean syntax, garbage collection, methods for any type, and \
run-time reflection. It feels like a dynamic language but has the speed and \
safety of a static language."
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-1.18.10-4.1.aarch64.rpm"
RPM_HASH = "7ef79cc7cf629855379e629b4accd184b9b57c9f6c48d4adfec3e7bed32eec38681f6bb282252a50557e7bdbc1d79a4f9c71a2cfc6e227f0178928f745750c96"

RPROVIDES:${PN} += "config(go1.18) go go-devel go-devel-static go1.18 go1.18(aarch-64) golang(API)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env gcc libc.so.6(GLIBC_2.34)(64bit) update-alternatives"

inherit rpm
