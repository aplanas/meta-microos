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

RPM_NAME = "webkit-jsc-4.1-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "36b0cd285a6e2f7aa31b155f7878a37213ce839392148658be98b85ae2aa3e4e4a8dcfcb0c36127f1fca7581938e88e88775ea3574e24f013615360687b21e94"

RPROVIDES:${PN} += "webkit-jsc-4.1 webkit-jsc-4.1(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libjavascriptcoregtk-4.1.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
