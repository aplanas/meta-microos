SUMMARY = "LVM locking daemon"
DESCRIPTION = "LVM commands use lvmlockd to coordinate access to shared storage."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-lockd-2.03.16-6.3.aarch64.rpm"
RPM_HASH = "b76a4bbb92da8def7e7d644efacc82af32831002b60ade4af9db95ab8e6c42d12a4e228696afb93a473f801f6b18fb60c70a33ad1190d49e6d6816e4fadf97dd"

RPROVIDES:${PN} += "lvm2-lockd lvm2-lockd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh corosync device-mapper ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdlm libdlm_lt.so.3()(64bit) libdlm_lt.so.3(V_4.1.0)(64bit) libdlmcontrol.so.3()(64bit) libdlmcontrol.so.3(V_4.1.0)(64bit) libsanlock_client.so.1()(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) lvm2 sanlock systemd"

inherit rpm
