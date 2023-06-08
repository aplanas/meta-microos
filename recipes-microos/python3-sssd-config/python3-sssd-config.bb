SUMMARY = "Python API for configuring sssd"
DESCRIPTION = "Provide python module to access and manage configuration of the System \
Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.8.2"

RPM_NAME = "python3-sssd-config-2.8.2-4.3.aarch64.rpm"
RPM_HASH = "721f2e4d0acc903f873781e1c31f270429b9611c894a844a86ab7105852ddb89c5e2b2a8b3c80507a6632fd8363ed0a001285783dfb559f1a1a434fb63e3e814"

RPROVIDES:${PN} += "python3-sssd-config python3-sssd-config(aarch-64) python3.10dist(sssdconfig) python3dist(sssdconfig)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libldb.so.2()(64bit) libldb.so.2(LDB_0.9.10)(64bit) libpopt.so.0()(64bit) libpopt.so.0(LIBPOPT_0)(64bit) libsss_crypt.so()(64bit) libsss_crypt.so(V_2.8.2)(64bit) libsss_debug.so()(64bit) libsss_debug.so(V_2.8.2)(64bit) libsss_util.so()(64bit) libsss_util.so(V_2.8.2)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) python(abi) python3"

inherit rpm
