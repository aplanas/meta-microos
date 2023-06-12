SUMMARY = "SELinux Translation Daemon"
DESCRIPTION = "Security-enhanced Linux is a feature of the Linux kernel and a number \
of utilities with enhanced security functionality designed to add \
mandatory access controls to Linux.  The Security-enhanced Linux \
kernel contains new architectural components originally developed to \
improve the security of the Flask operating system. These \
architectural components provide general support for the enforcement \
of many kinds of mandatory access control policies, including those \
based on the concepts of Type Enforcement, Role-based Access \
Control, and Multi-level Security. \
 \
mcstrans provides a translation daemon to translate SELinux categories \
from internal representations to user defined representation."
LICENSE = "GPL-2.0-or-later"

PV = "3.5"

RPM_NAME = "mcstrans-3.5-1.3.aarch64.rpm"
RPM_HASH = "83334e4c0c30062718e5940c62b30fd31df4be296ca9c10828e685b450c74597b8149ea9c69be9fab693d771c11beebce2b155a86d1f62d37d75428f885bb85d"

RPROVIDES:${PN} += "mcstrans \
mcstrans(aarch-64) \
setransd"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libpcre2-8.so.0()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
systemd"

inherit rpm
