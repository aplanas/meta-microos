SUMMARY = "A collection of simulators of historically significant data processing systems"
DESCRIPTION = "This package contains simulators of the following systems: \
Data General Nova \
Data General Eclipse \
Digital Equipment Corporation PDP-1 \
Digital Equipment Corporation PDP-4 \
Digital Equipment Corporation PDP-7 \
Digital Equipment Corporation PDP-8 \
Digital Equipment Corporation PDP-9 \
Digital Equipment Corporation PDP-10 \
Digital Equipment Corporation PDP-11 \
Digital Equipment Corporation PDP-15 \
Digital Equipment Corporation PDP-18B \
IBM 1401 \
IBM System 3 \
Hewlett-Packard HP 2100 \
Honeywell H316 \
MITS Altair 8800 \
 \
A disk image with UNIX V7 for the PDP-11 is included, instructions on \
how to make it work can be found in the file \
/usr/share/doc/packages/simh/simh_swre.txt in chapter 2.1.3. \
 \
A selection of software for other systems can be found at The Computer \
History Simulation Project at http://simh.trailing-edge.com/"
LICENSE = "BSD-3-Clause"

PV = "3.11_0"

RPM_NAME = "simh-3.11_0-1.12.aarch64.rpm"
RPM_HASH = "18ac987e5320a2f113730aec957114b4a307a903a61faaf7a9ba7a23cea085103cf3e1fb9cddc3c138d28c2674d1676c54aa7208221df9ad7fb6b9dee158d287"

RPROVIDES:${PN} += "simh simh(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
