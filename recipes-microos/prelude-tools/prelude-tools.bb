SUMMARY = "Tools for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-tools-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "6a396e5e8e7e0c421ae9b563542cffd3150260d4b8078014734f5959971fc41f090fcd2930e40f059120c6c9c4a1daffe37147bb3f4976cbeadac6c5d9a2d135"

RPROVIDES:${PN} += "config(prelude-tools) \
prelude-tools \
prelude-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libprelude.so.28()(64bit) \
libprelude28"

inherit rpm
