SUMMARY = "JavaScript command line from WebKit"
DESCRIPTION = "jsc is a command-line utility that allows you to run JavaScript \
programs outside of the context of a web browser. It is primarily \
used as part of the test harness for validating the JavaScript \
portions of WebKit, but can also be used as a scripting tool. \
 \
jsc can be run in an interactive mode to test out JavaScript \
expressions, or it can be passed one or more files to run similar to \
invoking a Perl or Python script."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.1"

RPM_NAME = "webkit-jsc-6.0-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "eb80cd4eaa08c0a02f98a80386c09c93f975e3fcb96bd2b4b2b190d1dd9489b04fab864c6e7784dfc9b5cb5e4105ed8e3643bfb2922bce01fac8b9b2a11d2482"

RPROVIDES:${PN} += "webkit-jsc-6.0 webkit-jsc-6.0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjavascriptcoregtk-6.0.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
