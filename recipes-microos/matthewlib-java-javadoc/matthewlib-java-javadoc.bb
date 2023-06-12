SUMMARY = "A few useful Java libraries"
DESCRIPTION = "A collection of Java libraries: - Unix Sockets Library This is a \
   collection of classes and native code to allow you to read and \
   write Unix sockets in Java. \
 \
- Debug Library This is a comprehensive logging and debugging \
   solution. \
 \
- CGI Library This is a collection of classes and native code to \
   allow you to write CGI applications in Java. \
 \
- I/O Library This provides a few much needed extensions to the Java \
   I/O subsystem. \
 \
- Hexdump This class formats byte-arrays in hex and ascii for display."
LICENSE = "MIT"

PV = "0.8"

RPM_NAME = "matthewlib-java-javadoc-0.8-13.6.aarch64.rpm"
RPM_HASH = "741e7c9a0adb5034eab6dc6201ca1e15121cf9d2dadfd3059c0dbbcbc14c71edc0f739d9b4f9d2fdf8cd04c22d82eafa8cedd4f3388ed1b2a11b61e03c763c3b"

RPROVIDES:${PN} += "matthewlib-java-javadoc \
matthewlib-java-javadoc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
