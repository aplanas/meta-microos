SUMMARY = "Java library for generating and interpreting ANSI escape sequences"
DESCRIPTION = "Jansi is a java library that allows you to use ANSI escape sequences \
in your Java console applications. It implements ANSI support on platforms \
which don't support it, like Windows, and provides graceful degradation for \
when output is being sent to output devices which cannot support ANSI sequences."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "jansi-2.4.0-2.1.aarch64.rpm"
RPM_HASH = "e89f7bd98cef039b50a30ea4dc0a11f626daa29f788c1df328c9dae5b066a63fe83f7bf12a25cb3881a555994ff0f12623db7fec683efc1da43edcda91f1d19d"

RPROVIDES:${PN} += "jansi jansi(aarch-64) libjansi.so()(64bit) mvn(org.fusesource.jansi:jansi) mvn(org.fusesource.jansi:jansi:pom:) osgi(org.fusesource.jansi)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
