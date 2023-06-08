SUMMARY = "A tool for statically checking C programs"
DESCRIPTION = "With minimal effort, LCLint can be used as a better lint.  If additional \
effort is invested adding annotations to programs, LCLint can perform \
stronger checks than can be done by any standard lint."
LICENSE = "GPL-2.0+"

PV = "3.1.2"

RPM_NAME = "splint-3.1.2-102.19.aarch64.rpm"
RPM_HASH = "356446ff20a15f92a52b98519bd0db4c247577ec4f317d6f1cf3dd69a75d6634f81daf4d50ed7d340fee48c1ee9f3f202c75605e43e8fc1bed8c041e94220c41"

RPROVIDES:${PN} += "splint splint(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfl.so.2()(64bit)"

inherit rpm
