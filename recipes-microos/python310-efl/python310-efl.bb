SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python310-efl-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "2428747f4804217b04cfc4f8bf101b0c31de21ef7b1c0a55723832965b8923b4890e1202e7e40b23eabaf8ab40c2415c6177a5af55b726a6f01aa070027d82b6"

RPROVIDES:${PN} += "python3-efl python3.10dist(python-efl) python310-efl python310-efl(aarch-64) python3dist(python-efl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libecore.so.1()(64bit) libecore_con.so.1()(64bit) libecore_file.so.1()(64bit) libecore_input.so.1()(64bit) libecore_x.so.1()(64bit) libedje.so.1()(64bit) libeina.so.1()(64bit) libelementary.so.1()(64bit) libemotion.so.1()(64bit) libeo.so.1()(64bit) libethumb.so.1()(64bit) libethumb_client.so.1()(64bit) libevas.so.1()(64bit) python(abi)"

inherit rpm
